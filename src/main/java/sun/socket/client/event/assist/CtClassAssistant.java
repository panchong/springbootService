package com.godme.client.event.assist;

import javassist.ClassPool;
import javassist.CtClass;
import org.springframework.util.Assert;

/**
 * 簡單封裝的工具類
 */
public class CtClassAssistant {
    private final static ClassPool classPool = ClassPool.getDefault();

    /**
     * 通過類型獲取全類名
     * @param clazz
     * @return
     */
    public static String nameOf(Class clazz){
        return clazz.getCanonicalName();
    }

    /**
     * 通過對象獲取全類名
     * @param object
     * @return
     */
    public static String nameOf(Object object){
        Assert.notNull(object, "object must not be null");
        return nameOf(object.getClass());
    }

    /**
     * 類數組獲取全類名數組
     * @param classes
     * @return
     */
    public static String[] nameOf(Class[] classes){
        Assert.notNull(classes, "classes must not be null");
        String[] names = new String[classes.length];
        for(int index = 0; index < classes.length; index++){
            names[index] = nameOf(classes[index]);
        }
        return names;
    }

    /**
     * 通過名稱獲取ctClass
     * @param name
     * @return
     */
    public static CtClass typeOf(String name){
        try{
            return classPool.get(name);
        }catch (Exception e){
            return classPool.makeClass(name);
        }
    }

    /**
     * 通過名稱數組獲取CtClass數組
     * @param name
     * @return
     */
    public static CtClass[] typeOf(String ...name){
        try{
            return classPool.get(name);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 通過類獲取CtClass
     * @param clazz
     * @return
     */
    public static CtClass typeOf(Class clazz){
        return typeOf(nameOf(clazz));
    }

    /**
     * 通過對象獲取CtClass
     * @param object
     * @return
     */
    public static CtClass typeOf(Object object){
        return typeOf(nameOf(object.getClass()));
    }

    /**
     * 批量獲取指定類的CtClass[]
     * @param classes
     * @return
     */
    public static CtClass[] typeOf(Class ...classes){
        return typeOf(nameOf(classes));
    }

    /**
     * 單個名稱强制數組獲取ctClass[]
     * @param name
     * @return
     */
    public static CtClass[] arrayTypeOf(String name){
        return typeOf(new String[]{name});
    }

    /**
     * 單個類型强制數組獲取CtClass[]
     * @param clazz
     * @return
     */
    public static CtClass[] arrayTypeOf(Class clazz){
        return arrayTypeOf(nameOf(clazz));
    }

    /**
     * 單個對象强制數組獲取CtClass[]
     * @param object
     * @return
     */
    public static CtClass[] arrayTypeOf(Object object){
        return arrayTypeOf(object.getClass());
    }

}
