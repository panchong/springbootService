package sun.socket;

public interface EventConsts {
    String BASEMESSAGE = "1";
    /**
     * 连接相关
     */
    String USER_CONNECT = "user connect";
    String USER_LEAVE_ROOM = "user leave room";
    String USER_DISCONNECT = "user disconnect";
    String USER_CONNECT_END = "connect end";

    /**
     * 课程开关
     */
    String LESSON_START = "lesson start";
    String LESSON_END = "lesson end";
    String RECORD_START = "record start";

    /**
     * 白板相关
     */
    String WHITEBOARD_CURRENT_DATA = "whiteboard current data";
    String WHITEBOARD_DATA = "whiteboard data";
    String WHITEBOARD_PAGE = "whiteboard page";
    String CLOSE_PPT_DOC = "close ppt doc";
    String OPEN_PPT_DOC = "open ppt doc";

    /**
     * 聊天相关
     */
    String CHAT_MESSAGE = "chat message";
    String CHAT_MESSAGE_CURRENT_EVENTS = "chat message catch up events";

    /**
     * 自定义事件类型
     */
    String EMIT_IN_SELF = "emit in self";
    String EMIT_ON_SELF = "emit on self";
    String EMIT_TO_MOBILE = "emit to mobile";
    String EMIT_TO_ROLE = "emit to role";
    String UPDATE_DEVICE = "update device";

    /**
     * 系统设置
     */
    String CONNECT_TYPE = "connect type";
    String CHANGE_CHANNEL = "change channel";
    String CLIENT_ID = "client id";
    String AUDIO_CHANNEL = "audio channel";
    String USER_KICKED = "user kicked";
    String MASSIVE_DATA_END = "massive data end";
    String STUNSERVERS = "stunservers";
    String TURNSERVERS = "turnservers";
    String CLIENT_GRAPH_ABILITY = "client graph ability";
    String CLIENT_STUDENT_GRAPH_ABILITY = "stu client graph ability";
    String SET_STATE = "set state";
    String GET_STATE = "get state";

    /**
     * ZMG相关
     */
    String ZMG = "zmg";
    String ZMG_GET = "get zmg";

    /**
     * 腾讯通道相关
     */
    String TENCENT_ROOM = "tencent room";
    String TENCENT_ROOM_CREATE = "tencent room create";
    String TENCENT_TEACHER_CHANNEL = "tencent teacher channel";
    String TENCENT_PUSH_STREAM = "tencent push stream";


    String SEND_DEVICE = "send device";

    String RECORD_CHECK = "record check";

    String GO_DEBUG_LESSON = "go debug lesson";

    String ALIVE = "alive";

    String TIME_CHECK = "time check";

    String MESSAGE = "message";

    String SHARE_SCREEN = "shareScreen";

    String UNSHARE_SCREEN = "unshareScreen";

    String JOIN = "join";

    String USER_JOIN_TIME = "user join room";

    String VIDEO_LEAVE = "video leave";

    String USER_LEAVE_VIDEO = "user leave video";

    String RECEIVE_VOICE_FILE = "receive voice file";

    String RECEIVE_VIDEO_FILE = "receive video file";

    String OPERATION_NOTIFY = "operation notify";

    String REFRESH_CHANNEL = "refresh channel";

    String IMAGE_RECEIVER = "image receiver";

    String ENTER_BACKGROUND_STU = "enterBackgroundStu";
}
