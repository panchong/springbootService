package sun.socket.pb;

public final class WhiteBroadMessages {
    private WhiteBroadMessages() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    public interface WhiteBroadMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.WhiteBroadMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * 事件源X
         * </pre>
         *
         * <code>int32 point_x = 1;</code>
         */
        int getPointX();

        /**
         * <pre>
         * 事件源Y
         * </pre>
         *
         * <code>int32 point_y = 2;</code>
         */
        int getPointY();

        /**
         * <pre>
         * 动作编号, actionId.client.Id
         * </pre>
         *
         * <code>int32 sequence = 3;</code>
         */
        int getSequence();

        /**
         * <pre>
         * 事件类型
         * </pre>
         *
         * <code>int32 event = 4;</code>
         */
        int getEvent();

        /**
         * <code>string default = 5;</code>
         */
        String getDefault();
        /**
         * <code>string default = 5;</code>
         */
        com.google.protobuf.ByteString
        getDefaultBytes();

        /**
         * <code>.sun.socket.pb.LoadSlideMessage loadSlide = 6;</code>
         */
        sun.socket.pb.WhiteBroadMessages.LoadSlideMessage getLoadSlide();
        /**
         * <code>.sun.socket.pb.LoadSlideMessage loadSlide = 6;</code>
         */
        sun.socket.pb.WhiteBroadMessages.LoadSlideMessageOrBuilder getLoadSlideOrBuilder();

        /**
         * <code>.sun.socket.pb.SwitchSlideMessage switchSlide = 7;</code>
         */
        sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage getSwitchSlide();
        /**
         * <code>.sun.socket.pb.SwitchSlideMessage switchSlide = 7;</code>
         */
        sun.socket.pb.WhiteBroadMessages.SwitchSlideMessageOrBuilder getSwitchSlideOrBuilder();

        /**
         * <code>.sun.socket.pb.ScrollSlideMessage scrollSlide = 8;</code>
         */
        sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage getScrollSlide();
        /**
         * <code>.sun.socket.pb.ScrollSlideMessage scrollSlide = 8;</code>
         */
        sun.socket.pb.WhiteBroadMessages.ScrollSlideMessageOrBuilder getScrollSlideOrBuilder();

        /**
         * <code>.sun.socket.pb.RotateSlideMessage rotateSlide = 9;</code>
         */
        sun.socket.pb.WhiteBroadMessages.RotateSlideMessage getRotateSlide();
        /**
         * <code>.sun.socket.pb.RotateSlideMessage rotateSlide = 9;</code>
         */
        sun.socket.pb.WhiteBroadMessages.RotateSlideMessageOrBuilder getRotateSlideOrBuilder();

        /**
         * <code>.sun.socket.pb.LoadPPTMessage loadPPT = 10;</code>
         */
        sun.socket.pb.WhiteBroadMessages.LoadPPTMessage getLoadPPT();
        /**
         * <code>.sun.socket.pb.LoadPPTMessage loadPPT = 10;</code>
         */
        sun.socket.pb.WhiteBroadMessages.LoadPPTMessageOrBuilder getLoadPPTOrBuilder();

        /**
         * <code>.sun.socket.pb.BrushMessage brush = 11;</code>
         */
        sun.socket.pb.WhiteBroadMessages.BrushMessage getBrush();
        /**
         * <code>.sun.socket.pb.BrushMessage brush = 11;</code>
         */
        sun.socket.pb.WhiteBroadMessages.BrushMessageOrBuilder getBrushOrBuilder();

        /**
         * <code>.sun.socket.pb.LineMessage line = 12;</code>
         */
        sun.socket.pb.WhiteBroadMessages.LineMessage getLine();
        /**
         * <code>.sun.socket.pb.LineMessage line = 12;</code>
         */
        sun.socket.pb.WhiteBroadMessages.LineMessageOrBuilder getLineOrBuilder();

        /**
         * <code>.sun.socket.pb.EllipseMessage ellipse = 13;</code>
         */
        sun.socket.pb.WhiteBroadMessages.EllipseMessage getEllipse();
        /**
         * <code>.sun.socket.pb.EllipseMessage ellipse = 13;</code>
         */
        sun.socket.pb.WhiteBroadMessages.EllipseMessageOrBuilder getEllipseOrBuilder();

        /**
         * <code>.sun.socket.pb.TextToolMessage text = 14;</code>
         */
        sun.socket.pb.WhiteBroadMessages.TextToolMessage getText();
        /**
         * <code>.sun.socket.pb.TextToolMessage text = 14;</code>
         */
        sun.socket.pb.WhiteBroadMessages.TextToolMessageOrBuilder getTextOrBuilder();

        /**
         * <code>.sun.socket.pb.EraserMessage eraser = 15;</code>
         */
        sun.socket.pb.WhiteBroadMessages.EraserMessage getEraser();
        /**
         * <code>.sun.socket.pb.EraserMessage eraser = 15;</code>
         */
        sun.socket.pb.WhiteBroadMessages.EraserMessageOrBuilder getEraserOrBuilder();

        /**
         * <code>.sun.socket.pb.EraserRectangleMessage eraserRectangle = 16;</code>
         */
        sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage getEraserRectangle();
        /**
         * <code>.sun.socket.pb.EraserRectangleMessage eraserRectangle = 16;</code>
         */
        sun.socket.pb.WhiteBroadMessages.EraserRectangleMessageOrBuilder getEraserRectangleOrBuilder();

        /**
         * <code>.sun.socket.pb.LineArrowMessage lineArrow = 17;</code>
         */
        sun.socket.pb.WhiteBroadMessages.LineArrowMessage getLineArrow();
        /**
         * <code>.sun.socket.pb.LineArrowMessage lineArrow = 17;</code>
         */
        sun.socket.pb.WhiteBroadMessages.LineArrowMessageOrBuilder getLineArrowOrBuilder();

        /**
         * <code>.sun.socket.pb.TriangleMessage triangle = 18;</code>
         */
        sun.socket.pb.WhiteBroadMessages.TriangleMessage getTriangle();
        /**
         * <code>.sun.socket.pb.TriangleMessage triangle = 18;</code>
         */
        sun.socket.pb.WhiteBroadMessages.TriangleMessageOrBuilder getTriangleOrBuilder();

        /**
         * <code>.sun.socket.pb.StartMessage start = 19;</code>
         */
        sun.socket.pb.WhiteBroadMessages.StartMessage getStart();
        /**
         * <code>.sun.socket.pb.StartMessage start = 19;</code>
         */
        sun.socket.pb.WhiteBroadMessages.StartMessageOrBuilder getStartOrBuilder();

        public sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage.EventMessageCase getEventMessageCase();
    }
    /**
     * <pre>
     * 基本白板数据
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.WhiteBroadMessage}
     */
    public  static final class WhiteBroadMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.WhiteBroadMessage)
            WhiteBroadMessageOrBuilder {
        // Use WhiteBroadMessage.newBuilder() to construct.
        private WhiteBroadMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private WhiteBroadMessage() {
            pointX_ = 0;
            pointY_ = 0;
            sequence_ = 0;
            event_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private WhiteBroadMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            pointX_ = input.readInt32();
                            break;
                        }
                        case 16: {

                            pointY_ = input.readInt32();
                            break;
                        }
                        case 24: {

                            sequence_ = input.readInt32();
                            break;
                        }
                        case 32: {

                            event_ = input.readInt32();
                            break;
                        }
                        case 42: {
                            String s = input.readStringRequireUtf8();
                            eventMessageCase_ = 5;
                            eventMessage_ = s;
                            break;
                        }
                        case 50: {
                            sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.Builder subBuilder = null;
                            if (eventMessageCase_ == 6) {
                                subBuilder = ((sun.socket.pb.WhiteBroadMessages.LoadSlideMessage) eventMessage_).toBuilder();
                            }
                            eventMessage_ =
                                    input.readMessage(sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((sun.socket.pb.WhiteBroadMessages.LoadSlideMessage) eventMessage_);
                                eventMessage_ = subBuilder.buildPartial();
                            }
                            eventMessageCase_ = 6;
                            break;
                        }
                        case 58: {
                            sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.Builder subBuilder = null;
                            if (eventMessageCase_ == 7) {
                                subBuilder = ((sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage) eventMessage_).toBuilder();
                            }
                            eventMessage_ =
                                    input.readMessage(sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage) eventMessage_);
                                eventMessage_ = subBuilder.buildPartial();
                            }
                            eventMessageCase_ = 7;
                            break;
                        }
                        case 66: {
                            sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.Builder subBuilder = null;
                            if (eventMessageCase_ == 8) {
                                subBuilder = ((sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage) eventMessage_).toBuilder();
                            }
                            eventMessage_ =
                                    input.readMessage(sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage) eventMessage_);
                                eventMessage_ = subBuilder.buildPartial();
                            }
                            eventMessageCase_ = 8;
                            break;
                        }
                        case 74: {
                            sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.Builder subBuilder = null;
                            if (eventMessageCase_ == 9) {
                                subBuilder = ((sun.socket.pb.WhiteBroadMessages.RotateSlideMessage) eventMessage_).toBuilder();
                            }
                            eventMessage_ =
                                    input.readMessage(sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((sun.socket.pb.WhiteBroadMessages.RotateSlideMessage) eventMessage_);
                                eventMessage_ = subBuilder.buildPartial();
                            }
                            eventMessageCase_ = 9;
                            break;
                        }
                        case 82: {
                            sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.Builder subBuilder = null;
                            if (eventMessageCase_ == 10) {
                                subBuilder = ((sun.socket.pb.WhiteBroadMessages.LoadPPTMessage) eventMessage_).toBuilder();
                            }
                            eventMessage_ =
                                    input.readMessage(sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((sun.socket.pb.WhiteBroadMessages.LoadPPTMessage) eventMessage_);
                                eventMessage_ = subBuilder.buildPartial();
                            }
                            eventMessageCase_ = 10;
                            break;
                        }
                        case 90: {
                            sun.socket.pb.WhiteBroadMessages.BrushMessage.Builder subBuilder = null;
                            if (eventMessageCase_ == 11) {
                                subBuilder = ((sun.socket.pb.WhiteBroadMessages.BrushMessage) eventMessage_).toBuilder();
                            }
                            eventMessage_ =
                                    input.readMessage(sun.socket.pb.WhiteBroadMessages.BrushMessage.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((sun.socket.pb.WhiteBroadMessages.BrushMessage) eventMessage_);
                                eventMessage_ = subBuilder.buildPartial();
                            }
                            eventMessageCase_ = 11;
                            break;
                        }
                        case 98: {
                            sun.socket.pb.WhiteBroadMessages.LineMessage.Builder subBuilder = null;
                            if (eventMessageCase_ == 12) {
                                subBuilder = ((sun.socket.pb.WhiteBroadMessages.LineMessage) eventMessage_).toBuilder();
                            }
                            eventMessage_ =
                                    input.readMessage(sun.socket.pb.WhiteBroadMessages.LineMessage.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((sun.socket.pb.WhiteBroadMessages.LineMessage) eventMessage_);
                                eventMessage_ = subBuilder.buildPartial();
                            }
                            eventMessageCase_ = 12;
                            break;
                        }
                        case 106: {
                            sun.socket.pb.WhiteBroadMessages.EllipseMessage.Builder subBuilder = null;
                            if (eventMessageCase_ == 13) {
                                subBuilder = ((sun.socket.pb.WhiteBroadMessages.EllipseMessage) eventMessage_).toBuilder();
                            }
                            eventMessage_ =
                                    input.readMessage(sun.socket.pb.WhiteBroadMessages.EllipseMessage.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((sun.socket.pb.WhiteBroadMessages.EllipseMessage) eventMessage_);
                                eventMessage_ = subBuilder.buildPartial();
                            }
                            eventMessageCase_ = 13;
                            break;
                        }
                        case 114: {
                            sun.socket.pb.WhiteBroadMessages.TextToolMessage.Builder subBuilder = null;
                            if (eventMessageCase_ == 14) {
                                subBuilder = ((sun.socket.pb.WhiteBroadMessages.TextToolMessage) eventMessage_).toBuilder();
                            }
                            eventMessage_ =
                                    input.readMessage(sun.socket.pb.WhiteBroadMessages.TextToolMessage.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((sun.socket.pb.WhiteBroadMessages.TextToolMessage) eventMessage_);
                                eventMessage_ = subBuilder.buildPartial();
                            }
                            eventMessageCase_ = 14;
                            break;
                        }
                        case 122: {
                            sun.socket.pb.WhiteBroadMessages.EraserMessage.Builder subBuilder = null;
                            if (eventMessageCase_ == 15) {
                                subBuilder = ((sun.socket.pb.WhiteBroadMessages.EraserMessage) eventMessage_).toBuilder();
                            }
                            eventMessage_ =
                                    input.readMessage(sun.socket.pb.WhiteBroadMessages.EraserMessage.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((sun.socket.pb.WhiteBroadMessages.EraserMessage) eventMessage_);
                                eventMessage_ = subBuilder.buildPartial();
                            }
                            eventMessageCase_ = 15;
                            break;
                        }
                        case 130: {
                            sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.Builder subBuilder = null;
                            if (eventMessageCase_ == 16) {
                                subBuilder = ((sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage) eventMessage_).toBuilder();
                            }
                            eventMessage_ =
                                    input.readMessage(sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage) eventMessage_);
                                eventMessage_ = subBuilder.buildPartial();
                            }
                            eventMessageCase_ = 16;
                            break;
                        }
                        case 138: {
                            sun.socket.pb.WhiteBroadMessages.LineArrowMessage.Builder subBuilder = null;
                            if (eventMessageCase_ == 17) {
                                subBuilder = ((sun.socket.pb.WhiteBroadMessages.LineArrowMessage) eventMessage_).toBuilder();
                            }
                            eventMessage_ =
                                    input.readMessage(sun.socket.pb.WhiteBroadMessages.LineArrowMessage.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((sun.socket.pb.WhiteBroadMessages.LineArrowMessage) eventMessage_);
                                eventMessage_ = subBuilder.buildPartial();
                            }
                            eventMessageCase_ = 17;
                            break;
                        }
                        case 146: {
                            sun.socket.pb.WhiteBroadMessages.TriangleMessage.Builder subBuilder = null;
                            if (eventMessageCase_ == 18) {
                                subBuilder = ((sun.socket.pb.WhiteBroadMessages.TriangleMessage) eventMessage_).toBuilder();
                            }
                            eventMessage_ =
                                    input.readMessage(sun.socket.pb.WhiteBroadMessages.TriangleMessage.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((sun.socket.pb.WhiteBroadMessages.TriangleMessage) eventMessage_);
                                eventMessage_ = subBuilder.buildPartial();
                            }
                            eventMessageCase_ = 18;
                            break;
                        }
                        case 154: {
                            sun.socket.pb.WhiteBroadMessages.StartMessage.Builder subBuilder = null;
                            if (eventMessageCase_ == 19) {
                                subBuilder = ((sun.socket.pb.WhiteBroadMessages.StartMessage) eventMessage_).toBuilder();
                            }
                            eventMessage_ =
                                    input.readMessage(sun.socket.pb.WhiteBroadMessages.StartMessage.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((sun.socket.pb.WhiteBroadMessages.StartMessage) eventMessage_);
                                eventMessage_ = subBuilder.buildPartial();
                            }
                            eventMessageCase_ = 19;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_WhiteBroadMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_WhiteBroadMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage.class, sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage.Builder.class);
        }

        private int eventMessageCase_ = 0;
        private Object eventMessage_;
        public enum EventMessageCase
                implements com.google.protobuf.Internal.EnumLite {
            DEFAULT(5),
            LOADSLIDE(6),
            SWITCHSLIDE(7),
            SCROLLSLIDE(8),
            ROTATESLIDE(9),
            LOADPPT(10),
            BRUSH(11),
            LINE(12),
            ELLIPSE(13),
            TEXT(14),
            ERASER(15),
            ERASERRECTANGLE(16),
            LINEARROW(17),
            TRIANGLE(18),
            START(19),
            EVENTMESSAGE_NOT_SET(0);
            private final int value;
            private EventMessageCase(int value) {
                this.value = value;
            }
            /**
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @Deprecated
            public static EventMessageCase valueOf(int value) {
                return forNumber(value);
            }

            public static EventMessageCase forNumber(int value) {
                switch (value) {
                    case 5: return DEFAULT;
                    case 6: return LOADSLIDE;
                    case 7: return SWITCHSLIDE;
                    case 8: return SCROLLSLIDE;
                    case 9: return ROTATESLIDE;
                    case 10: return LOADPPT;
                    case 11: return BRUSH;
                    case 12: return LINE;
                    case 13: return ELLIPSE;
                    case 14: return TEXT;
                    case 15: return ERASER;
                    case 16: return ERASERRECTANGLE;
                    case 17: return LINEARROW;
                    case 18: return TRIANGLE;
                    case 19: return START;
                    case 0: return EVENTMESSAGE_NOT_SET;
                    default: return null;
                }
            }
            public int getNumber() {
                return this.value;
            }
        };

        public EventMessageCase
        getEventMessageCase() {
            return EventMessageCase.forNumber(
                    eventMessageCase_);
        }

        public static final int POINT_X_FIELD_NUMBER = 1;
        private int pointX_;
        /**
         * <pre>
         * 事件源X
         * </pre>
         *
         * <code>int32 point_x = 1;</code>
         */
        public int getPointX() {
            return pointX_;
        }

        public static final int POINT_Y_FIELD_NUMBER = 2;
        private int pointY_;
        /**
         * <pre>
         * 事件源Y
         * </pre>
         *
         * <code>int32 point_y = 2;</code>
         */
        public int getPointY() {
            return pointY_;
        }

        public static final int SEQUENCE_FIELD_NUMBER = 3;
        private int sequence_;
        /**
         * <pre>
         * 动作编号, actionId.client.Id
         * </pre>
         *
         * <code>int32 sequence = 3;</code>
         */
        public int getSequence() {
            return sequence_;
        }

        public static final int EVENT_FIELD_NUMBER = 4;
        private int event_;
        /**
         * <pre>
         * 事件类型
         * </pre>
         *
         * <code>int32 event = 4;</code>
         */
        public int getEvent() {
            return event_;
        }

        public static final int DEFAULT_FIELD_NUMBER = 5;
        /**
         * <code>string default = 5;</code>
         */
        public String getDefault() {
            Object ref = "";
            if (eventMessageCase_ == 5) {
                ref = eventMessage_;
            }
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (eventMessageCase_ == 5) {
                    eventMessage_ = s;
                }
                return s;
            }
        }
        /**
         * <code>string default = 5;</code>
         */
        public com.google.protobuf.ByteString
        getDefaultBytes() {
            Object ref = "";
            if (eventMessageCase_ == 5) {
                ref = eventMessage_;
            }
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                if (eventMessageCase_ == 5) {
                    eventMessage_ = b;
                }
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int LOADSLIDE_FIELD_NUMBER = 6;
        /**
         * <code>.sun.socket.pb.LoadSlideMessage loadSlide = 6;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.LoadSlideMessage getLoadSlide() {
            if (eventMessageCase_ == 6) {
                return (sun.socket.pb.WhiteBroadMessages.LoadSlideMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.getDefaultInstance();
        }
        /**
         * <code>.sun.socket.pb.LoadSlideMessage loadSlide = 6;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.LoadSlideMessageOrBuilder getLoadSlideOrBuilder() {
            if (eventMessageCase_ == 6) {
                return (sun.socket.pb.WhiteBroadMessages.LoadSlideMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.getDefaultInstance();
        }

        public static final int SWITCHSLIDE_FIELD_NUMBER = 7;
        /**
         * <code>.sun.socket.pb.SwitchSlideMessage switchSlide = 7;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage getSwitchSlide() {
            if (eventMessageCase_ == 7) {
                return (sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.getDefaultInstance();
        }
        /**
         * <code>.sun.socket.pb.SwitchSlideMessage switchSlide = 7;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.SwitchSlideMessageOrBuilder getSwitchSlideOrBuilder() {
            if (eventMessageCase_ == 7) {
                return (sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.getDefaultInstance();
        }

        public static final int SCROLLSLIDE_FIELD_NUMBER = 8;
        /**
         * <code>.sun.socket.pb.ScrollSlideMessage scrollSlide = 8;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage getScrollSlide() {
            if (eventMessageCase_ == 8) {
                return (sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.getDefaultInstance();
        }
        /**
         * <code>.sun.socket.pb.ScrollSlideMessage scrollSlide = 8;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.ScrollSlideMessageOrBuilder getScrollSlideOrBuilder() {
            if (eventMessageCase_ == 8) {
                return (sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.getDefaultInstance();
        }

        public static final int ROTATESLIDE_FIELD_NUMBER = 9;
        /**
         * <code>.sun.socket.pb.RotateSlideMessage rotateSlide = 9;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.RotateSlideMessage getRotateSlide() {
            if (eventMessageCase_ == 9) {
                return (sun.socket.pb.WhiteBroadMessages.RotateSlideMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.getDefaultInstance();
        }
        /**
         * <code>.sun.socket.pb.RotateSlideMessage rotateSlide = 9;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.RotateSlideMessageOrBuilder getRotateSlideOrBuilder() {
            if (eventMessageCase_ == 9) {
                return (sun.socket.pb.WhiteBroadMessages.RotateSlideMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.getDefaultInstance();
        }

        public static final int LOADPPT_FIELD_NUMBER = 10;
        /**
         * <code>.sun.socket.pb.LoadPPTMessage loadPPT = 10;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.LoadPPTMessage getLoadPPT() {
            if (eventMessageCase_ == 10) {
                return (sun.socket.pb.WhiteBroadMessages.LoadPPTMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.getDefaultInstance();
        }
        /**
         * <code>.sun.socket.pb.LoadPPTMessage loadPPT = 10;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.LoadPPTMessageOrBuilder getLoadPPTOrBuilder() {
            if (eventMessageCase_ == 10) {
                return (sun.socket.pb.WhiteBroadMessages.LoadPPTMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.getDefaultInstance();
        }

        public static final int BRUSH_FIELD_NUMBER = 11;
        /**
         * <code>.sun.socket.pb.BrushMessage brush = 11;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.BrushMessage getBrush() {
            if (eventMessageCase_ == 11) {
                return (sun.socket.pb.WhiteBroadMessages.BrushMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.BrushMessage.getDefaultInstance();
        }
        /**
         * <code>.sun.socket.pb.BrushMessage brush = 11;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.BrushMessageOrBuilder getBrushOrBuilder() {
            if (eventMessageCase_ == 11) {
                return (sun.socket.pb.WhiteBroadMessages.BrushMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.BrushMessage.getDefaultInstance();
        }

        public static final int LINE_FIELD_NUMBER = 12;
        /**
         * <code>.sun.socket.pb.LineMessage line = 12;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.LineMessage getLine() {
            if (eventMessageCase_ == 12) {
                return (sun.socket.pb.WhiteBroadMessages.LineMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.LineMessage.getDefaultInstance();
        }
        /**
         * <code>.sun.socket.pb.LineMessage line = 12;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.LineMessageOrBuilder getLineOrBuilder() {
            if (eventMessageCase_ == 12) {
                return (sun.socket.pb.WhiteBroadMessages.LineMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.LineMessage.getDefaultInstance();
        }

        public static final int ELLIPSE_FIELD_NUMBER = 13;
        /**
         * <code>.sun.socket.pb.EllipseMessage ellipse = 13;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.EllipseMessage getEllipse() {
            if (eventMessageCase_ == 13) {
                return (sun.socket.pb.WhiteBroadMessages.EllipseMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.EllipseMessage.getDefaultInstance();
        }
        /**
         * <code>.sun.socket.pb.EllipseMessage ellipse = 13;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.EllipseMessageOrBuilder getEllipseOrBuilder() {
            if (eventMessageCase_ == 13) {
                return (sun.socket.pb.WhiteBroadMessages.EllipseMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.EllipseMessage.getDefaultInstance();
        }

        public static final int TEXT_FIELD_NUMBER = 14;
        /**
         * <code>.sun.socket.pb.TextToolMessage text = 14;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.TextToolMessage getText() {
            if (eventMessageCase_ == 14) {
                return (sun.socket.pb.WhiteBroadMessages.TextToolMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.TextToolMessage.getDefaultInstance();
        }
        /**
         * <code>.sun.socket.pb.TextToolMessage text = 14;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.TextToolMessageOrBuilder getTextOrBuilder() {
            if (eventMessageCase_ == 14) {
                return (sun.socket.pb.WhiteBroadMessages.TextToolMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.TextToolMessage.getDefaultInstance();
        }

        public static final int ERASER_FIELD_NUMBER = 15;
        /**
         * <code>.sun.socket.pb.EraserMessage eraser = 15;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.EraserMessage getEraser() {
            if (eventMessageCase_ == 15) {
                return (sun.socket.pb.WhiteBroadMessages.EraserMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.EraserMessage.getDefaultInstance();
        }
        /**
         * <code>.sun.socket.pb.EraserMessage eraser = 15;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.EraserMessageOrBuilder getEraserOrBuilder() {
            if (eventMessageCase_ == 15) {
                return (sun.socket.pb.WhiteBroadMessages.EraserMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.EraserMessage.getDefaultInstance();
        }

        public static final int ERASERRECTANGLE_FIELD_NUMBER = 16;
        /**
         * <code>.sun.socket.pb.EraserRectangleMessage eraserRectangle = 16;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage getEraserRectangle() {
            if (eventMessageCase_ == 16) {
                return (sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.getDefaultInstance();
        }
        /**
         * <code>.sun.socket.pb.EraserRectangleMessage eraserRectangle = 16;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.EraserRectangleMessageOrBuilder getEraserRectangleOrBuilder() {
            if (eventMessageCase_ == 16) {
                return (sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.getDefaultInstance();
        }

        public static final int LINEARROW_FIELD_NUMBER = 17;
        /**
         * <code>.sun.socket.pb.LineArrowMessage lineArrow = 17;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.LineArrowMessage getLineArrow() {
            if (eventMessageCase_ == 17) {
                return (sun.socket.pb.WhiteBroadMessages.LineArrowMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.LineArrowMessage.getDefaultInstance();
        }
        /**
         * <code>.sun.socket.pb.LineArrowMessage lineArrow = 17;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.LineArrowMessageOrBuilder getLineArrowOrBuilder() {
            if (eventMessageCase_ == 17) {
                return (sun.socket.pb.WhiteBroadMessages.LineArrowMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.LineArrowMessage.getDefaultInstance();
        }

        public static final int TRIANGLE_FIELD_NUMBER = 18;
        /**
         * <code>.sun.socket.pb.TriangleMessage triangle = 18;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.TriangleMessage getTriangle() {
            if (eventMessageCase_ == 18) {
                return (sun.socket.pb.WhiteBroadMessages.TriangleMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.TriangleMessage.getDefaultInstance();
        }
        /**
         * <code>.sun.socket.pb.TriangleMessage triangle = 18;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.TriangleMessageOrBuilder getTriangleOrBuilder() {
            if (eventMessageCase_ == 18) {
                return (sun.socket.pb.WhiteBroadMessages.TriangleMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.TriangleMessage.getDefaultInstance();
        }

        public static final int START_FIELD_NUMBER = 19;
        /**
         * <code>.sun.socket.pb.StartMessage start = 19;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.StartMessage getStart() {
            if (eventMessageCase_ == 19) {
                return (sun.socket.pb.WhiteBroadMessages.StartMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.StartMessage.getDefaultInstance();
        }
        /**
         * <code>.sun.socket.pb.StartMessage start = 19;</code>
         */
        public sun.socket.pb.WhiteBroadMessages.StartMessageOrBuilder getStartOrBuilder() {
            if (eventMessageCase_ == 19) {
                return (sun.socket.pb.WhiteBroadMessages.StartMessage) eventMessage_;
            }
            return sun.socket.pb.WhiteBroadMessages.StartMessage.getDefaultInstance();
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (pointX_ != 0) {
                output.writeInt32(1, pointX_);
            }
            if (pointY_ != 0) {
                output.writeInt32(2, pointY_);
            }
            if (sequence_ != 0) {
                output.writeInt32(3, sequence_);
            }
            if (event_ != 0) {
                output.writeInt32(4, event_);
            }
            if (eventMessageCase_ == 5) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 5, eventMessage_);
            }
            if (eventMessageCase_ == 6) {
                output.writeMessage(6, (sun.socket.pb.WhiteBroadMessages.LoadSlideMessage) eventMessage_);
            }
            if (eventMessageCase_ == 7) {
                output.writeMessage(7, (sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage) eventMessage_);
            }
            if (eventMessageCase_ == 8) {
                output.writeMessage(8, (sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage) eventMessage_);
            }
            if (eventMessageCase_ == 9) {
                output.writeMessage(9, (sun.socket.pb.WhiteBroadMessages.RotateSlideMessage) eventMessage_);
            }
            if (eventMessageCase_ == 10) {
                output.writeMessage(10, (sun.socket.pb.WhiteBroadMessages.LoadPPTMessage) eventMessage_);
            }
            if (eventMessageCase_ == 11) {
                output.writeMessage(11, (sun.socket.pb.WhiteBroadMessages.BrushMessage) eventMessage_);
            }
            if (eventMessageCase_ == 12) {
                output.writeMessage(12, (sun.socket.pb.WhiteBroadMessages.LineMessage) eventMessage_);
            }
            if (eventMessageCase_ == 13) {
                output.writeMessage(13, (sun.socket.pb.WhiteBroadMessages.EllipseMessage) eventMessage_);
            }
            if (eventMessageCase_ == 14) {
                output.writeMessage(14, (sun.socket.pb.WhiteBroadMessages.TextToolMessage) eventMessage_);
            }
            if (eventMessageCase_ == 15) {
                output.writeMessage(15, (sun.socket.pb.WhiteBroadMessages.EraserMessage) eventMessage_);
            }
            if (eventMessageCase_ == 16) {
                output.writeMessage(16, (sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage) eventMessage_);
            }
            if (eventMessageCase_ == 17) {
                output.writeMessage(17, (sun.socket.pb.WhiteBroadMessages.LineArrowMessage) eventMessage_);
            }
            if (eventMessageCase_ == 18) {
                output.writeMessage(18, (sun.socket.pb.WhiteBroadMessages.TriangleMessage) eventMessage_);
            }
            if (eventMessageCase_ == 19) {
                output.writeMessage(19, (sun.socket.pb.WhiteBroadMessages.StartMessage) eventMessage_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (pointX_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, pointX_);
            }
            if (pointY_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, pointY_);
            }
            if (sequence_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, sequence_);
            }
            if (event_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(4, event_);
            }
            if (eventMessageCase_ == 5) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, eventMessage_);
            }
            if (eventMessageCase_ == 6) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(6, (sun.socket.pb.WhiteBroadMessages.LoadSlideMessage) eventMessage_);
            }
            if (eventMessageCase_ == 7) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(7, (sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage) eventMessage_);
            }
            if (eventMessageCase_ == 8) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(8, (sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage) eventMessage_);
            }
            if (eventMessageCase_ == 9) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(9, (sun.socket.pb.WhiteBroadMessages.RotateSlideMessage) eventMessage_);
            }
            if (eventMessageCase_ == 10) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(10, (sun.socket.pb.WhiteBroadMessages.LoadPPTMessage) eventMessage_);
            }
            if (eventMessageCase_ == 11) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(11, (sun.socket.pb.WhiteBroadMessages.BrushMessage) eventMessage_);
            }
            if (eventMessageCase_ == 12) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(12, (sun.socket.pb.WhiteBroadMessages.LineMessage) eventMessage_);
            }
            if (eventMessageCase_ == 13) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(13, (sun.socket.pb.WhiteBroadMessages.EllipseMessage) eventMessage_);
            }
            if (eventMessageCase_ == 14) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(14, (sun.socket.pb.WhiteBroadMessages.TextToolMessage) eventMessage_);
            }
            if (eventMessageCase_ == 15) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(15, (sun.socket.pb.WhiteBroadMessages.EraserMessage) eventMessage_);
            }
            if (eventMessageCase_ == 16) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(16, (sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage) eventMessage_);
            }
            if (eventMessageCase_ == 17) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(17, (sun.socket.pb.WhiteBroadMessages.LineArrowMessage) eventMessage_);
            }
            if (eventMessageCase_ == 18) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(18, (sun.socket.pb.WhiteBroadMessages.TriangleMessage) eventMessage_);
            }
            if (eventMessageCase_ == 19) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(19, (sun.socket.pb.WhiteBroadMessages.StartMessage) eventMessage_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage other = (sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage) obj;

            boolean result = true;
            result = result && (getPointX()
                    == other.getPointX());
            result = result && (getPointY()
                    == other.getPointY());
            result = result && (getSequence()
                    == other.getSequence());
            result = result && (getEvent()
                    == other.getEvent());
            result = result && getEventMessageCase().equals(
                    other.getEventMessageCase());
            if (!result) return false;
            switch (eventMessageCase_) {
                case 5:
                    result = result && getDefault()
                            .equals(other.getDefault());
                    break;
                case 6:
                    result = result && getLoadSlide()
                            .equals(other.getLoadSlide());
                    break;
                case 7:
                    result = result && getSwitchSlide()
                            .equals(other.getSwitchSlide());
                    break;
                case 8:
                    result = result && getScrollSlide()
                            .equals(other.getScrollSlide());
                    break;
                case 9:
                    result = result && getRotateSlide()
                            .equals(other.getRotateSlide());
                    break;
                case 10:
                    result = result && getLoadPPT()
                            .equals(other.getLoadPPT());
                    break;
                case 11:
                    result = result && getBrush()
                            .equals(other.getBrush());
                    break;
                case 12:
                    result = result && getLine()
                            .equals(other.getLine());
                    break;
                case 13:
                    result = result && getEllipse()
                            .equals(other.getEllipse());
                    break;
                case 14:
                    result = result && getText()
                            .equals(other.getText());
                    break;
                case 15:
                    result = result && getEraser()
                            .equals(other.getEraser());
                    break;
                case 16:
                    result = result && getEraserRectangle()
                            .equals(other.getEraserRectangle());
                    break;
                case 17:
                    result = result && getLineArrow()
                            .equals(other.getLineArrow());
                    break;
                case 18:
                    result = result && getTriangle()
                            .equals(other.getTriangle());
                    break;
                case 19:
                    result = result && getStart()
                            .equals(other.getStart());
                    break;
                case 0:
                default:
            }
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + POINT_X_FIELD_NUMBER;
            hash = (53 * hash) + getPointX();
            hash = (37 * hash) + POINT_Y_FIELD_NUMBER;
            hash = (53 * hash) + getPointY();
            hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
            hash = (53 * hash) + getSequence();
            hash = (37 * hash) + EVENT_FIELD_NUMBER;
            hash = (53 * hash) + getEvent();
            switch (eventMessageCase_) {
                case 5:
                    hash = (37 * hash) + DEFAULT_FIELD_NUMBER;
                    hash = (53 * hash) + getDefault().hashCode();
                    break;
                case 6:
                    hash = (37 * hash) + LOADSLIDE_FIELD_NUMBER;
                    hash = (53 * hash) + getLoadSlide().hashCode();
                    break;
                case 7:
                    hash = (37 * hash) + SWITCHSLIDE_FIELD_NUMBER;
                    hash = (53 * hash) + getSwitchSlide().hashCode();
                    break;
                case 8:
                    hash = (37 * hash) + SCROLLSLIDE_FIELD_NUMBER;
                    hash = (53 * hash) + getScrollSlide().hashCode();
                    break;
                case 9:
                    hash = (37 * hash) + ROTATESLIDE_FIELD_NUMBER;
                    hash = (53 * hash) + getRotateSlide().hashCode();
                    break;
                case 10:
                    hash = (37 * hash) + LOADPPT_FIELD_NUMBER;
                    hash = (53 * hash) + getLoadPPT().hashCode();
                    break;
                case 11:
                    hash = (37 * hash) + BRUSH_FIELD_NUMBER;
                    hash = (53 * hash) + getBrush().hashCode();
                    break;
                case 12:
                    hash = (37 * hash) + LINE_FIELD_NUMBER;
                    hash = (53 * hash) + getLine().hashCode();
                    break;
                case 13:
                    hash = (37 * hash) + ELLIPSE_FIELD_NUMBER;
                    hash = (53 * hash) + getEllipse().hashCode();
                    break;
                case 14:
                    hash = (37 * hash) + TEXT_FIELD_NUMBER;
                    hash = (53 * hash) + getText().hashCode();
                    break;
                case 15:
                    hash = (37 * hash) + ERASER_FIELD_NUMBER;
                    hash = (53 * hash) + getEraser().hashCode();
                    break;
                case 16:
                    hash = (37 * hash) + ERASERRECTANGLE_FIELD_NUMBER;
                    hash = (53 * hash) + getEraserRectangle().hashCode();
                    break;
                case 17:
                    hash = (37 * hash) + LINEARROW_FIELD_NUMBER;
                    hash = (53 * hash) + getLineArrow().hashCode();
                    break;
                case 18:
                    hash = (37 * hash) + TRIANGLE_FIELD_NUMBER;
                    hash = (53 * hash) + getTriangle().hashCode();
                    break;
                case 19:
                    hash = (37 * hash) + START_FIELD_NUMBER;
                    hash = (53 * hash) + getStart().hashCode();
                    break;
                case 0:
                default:
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * 基本白板数据
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.WhiteBroadMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.WhiteBroadMessage)
                sun.socket.pb.WhiteBroadMessages.WhiteBroadMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_WhiteBroadMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_WhiteBroadMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage.class, sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                pointX_ = 0;

                pointY_ = 0;

                sequence_ = 0;

                event_ = 0;

                eventMessageCase_ = 0;
                eventMessage_ = null;
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_WhiteBroadMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage build() {
                sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage result = new sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage(this);
                result.pointX_ = pointX_;
                result.pointY_ = pointY_;
                result.sequence_ = sequence_;
                result.event_ = event_;
                if (eventMessageCase_ == 5) {
                    result.eventMessage_ = eventMessage_;
                }
                if (eventMessageCase_ == 6) {
                    if (loadSlideBuilder_ == null) {
                        result.eventMessage_ = eventMessage_;
                    } else {
                        result.eventMessage_ = loadSlideBuilder_.build();
                    }
                }
                if (eventMessageCase_ == 7) {
                    if (switchSlideBuilder_ == null) {
                        result.eventMessage_ = eventMessage_;
                    } else {
                        result.eventMessage_ = switchSlideBuilder_.build();
                    }
                }
                if (eventMessageCase_ == 8) {
                    if (scrollSlideBuilder_ == null) {
                        result.eventMessage_ = eventMessage_;
                    } else {
                        result.eventMessage_ = scrollSlideBuilder_.build();
                    }
                }
                if (eventMessageCase_ == 9) {
                    if (rotateSlideBuilder_ == null) {
                        result.eventMessage_ = eventMessage_;
                    } else {
                        result.eventMessage_ = rotateSlideBuilder_.build();
                    }
                }
                if (eventMessageCase_ == 10) {
                    if (loadPPTBuilder_ == null) {
                        result.eventMessage_ = eventMessage_;
                    } else {
                        result.eventMessage_ = loadPPTBuilder_.build();
                    }
                }
                if (eventMessageCase_ == 11) {
                    if (brushBuilder_ == null) {
                        result.eventMessage_ = eventMessage_;
                    } else {
                        result.eventMessage_ = brushBuilder_.build();
                    }
                }
                if (eventMessageCase_ == 12) {
                    if (lineBuilder_ == null) {
                        result.eventMessage_ = eventMessage_;
                    } else {
                        result.eventMessage_ = lineBuilder_.build();
                    }
                }
                if (eventMessageCase_ == 13) {
                    if (ellipseBuilder_ == null) {
                        result.eventMessage_ = eventMessage_;
                    } else {
                        result.eventMessage_ = ellipseBuilder_.build();
                    }
                }
                if (eventMessageCase_ == 14) {
                    if (textBuilder_ == null) {
                        result.eventMessage_ = eventMessage_;
                    } else {
                        result.eventMessage_ = textBuilder_.build();
                    }
                }
                if (eventMessageCase_ == 15) {
                    if (eraserBuilder_ == null) {
                        result.eventMessage_ = eventMessage_;
                    } else {
                        result.eventMessage_ = eraserBuilder_.build();
                    }
                }
                if (eventMessageCase_ == 16) {
                    if (eraserRectangleBuilder_ == null) {
                        result.eventMessage_ = eventMessage_;
                    } else {
                        result.eventMessage_ = eraserRectangleBuilder_.build();
                    }
                }
                if (eventMessageCase_ == 17) {
                    if (lineArrowBuilder_ == null) {
                        result.eventMessage_ = eventMessage_;
                    } else {
                        result.eventMessage_ = lineArrowBuilder_.build();
                    }
                }
                if (eventMessageCase_ == 18) {
                    if (triangleBuilder_ == null) {
                        result.eventMessage_ = eventMessage_;
                    } else {
                        result.eventMessage_ = triangleBuilder_.build();
                    }
                }
                if (eventMessageCase_ == 19) {
                    if (startBuilder_ == null) {
                        result.eventMessage_ = eventMessage_;
                    } else {
                        result.eventMessage_ = startBuilder_.build();
                    }
                }
                result.eventMessageCase_ = eventMessageCase_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage.getDefaultInstance()) return this;
                if (other.getPointX() != 0) {
                    setPointX(other.getPointX());
                }
                if (other.getPointY() != 0) {
                    setPointY(other.getPointY());
                }
                if (other.getSequence() != 0) {
                    setSequence(other.getSequence());
                }
                if (other.getEvent() != 0) {
                    setEvent(other.getEvent());
                }
                switch (other.getEventMessageCase()) {
                    case DEFAULT: {
                        eventMessageCase_ = 5;
                        eventMessage_ = other.eventMessage_;
                        onChanged();
                        break;
                    }
                    case LOADSLIDE: {
                        mergeLoadSlide(other.getLoadSlide());
                        break;
                    }
                    case SWITCHSLIDE: {
                        mergeSwitchSlide(other.getSwitchSlide());
                        break;
                    }
                    case SCROLLSLIDE: {
                        mergeScrollSlide(other.getScrollSlide());
                        break;
                    }
                    case ROTATESLIDE: {
                        mergeRotateSlide(other.getRotateSlide());
                        break;
                    }
                    case LOADPPT: {
                        mergeLoadPPT(other.getLoadPPT());
                        break;
                    }
                    case BRUSH: {
                        mergeBrush(other.getBrush());
                        break;
                    }
                    case LINE: {
                        mergeLine(other.getLine());
                        break;
                    }
                    case ELLIPSE: {
                        mergeEllipse(other.getEllipse());
                        break;
                    }
                    case TEXT: {
                        mergeText(other.getText());
                        break;
                    }
                    case ERASER: {
                        mergeEraser(other.getEraser());
                        break;
                    }
                    case ERASERRECTANGLE: {
                        mergeEraserRectangle(other.getEraserRectangle());
                        break;
                    }
                    case LINEARROW: {
                        mergeLineArrow(other.getLineArrow());
                        break;
                    }
                    case TRIANGLE: {
                        mergeTriangle(other.getTriangle());
                        break;
                    }
                    case START: {
                        mergeStart(other.getStart());
                        break;
                    }
                    case EVENTMESSAGE_NOT_SET: {
                        break;
                    }
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int eventMessageCase_ = 0;
            private Object eventMessage_;
            public EventMessageCase
            getEventMessageCase() {
                return EventMessageCase.forNumber(
                        eventMessageCase_);
            }

            public Builder clearEventMessage() {
                eventMessageCase_ = 0;
                eventMessage_ = null;
                onChanged();
                return this;
            }


            private int pointX_ ;
            /**
             * <pre>
             * 事件源X
             * </pre>
             *
             * <code>int32 point_x = 1;</code>
             */
            public int getPointX() {
                return pointX_;
            }
            /**
             * <pre>
             * 事件源X
             * </pre>
             *
             * <code>int32 point_x = 1;</code>
             */
            public Builder setPointX(int value) {

                pointX_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * 事件源X
             * </pre>
             *
             * <code>int32 point_x = 1;</code>
             */
            public Builder clearPointX() {

                pointX_ = 0;
                onChanged();
                return this;
            }

            private int pointY_ ;
            /**
             * <pre>
             * 事件源Y
             * </pre>
             *
             * <code>int32 point_y = 2;</code>
             */
            public int getPointY() {
                return pointY_;
            }
            /**
             * <pre>
             * 事件源Y
             * </pre>
             *
             * <code>int32 point_y = 2;</code>
             */
            public Builder setPointY(int value) {

                pointY_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * 事件源Y
             * </pre>
             *
             * <code>int32 point_y = 2;</code>
             */
            public Builder clearPointY() {

                pointY_ = 0;
                onChanged();
                return this;
            }

            private int sequence_ ;
            /**
             * <pre>
             * 动作编号, actionId.client.Id
             * </pre>
             *
             * <code>int32 sequence = 3;</code>
             */
            public int getSequence() {
                return sequence_;
            }
            /**
             * <pre>
             * 动作编号, actionId.client.Id
             * </pre>
             *
             * <code>int32 sequence = 3;</code>
             */
            public Builder setSequence(int value) {

                sequence_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * 动作编号, actionId.client.Id
             * </pre>
             *
             * <code>int32 sequence = 3;</code>
             */
            public Builder clearSequence() {

                sequence_ = 0;
                onChanged();
                return this;
            }

            private int event_ ;
            /**
             * <pre>
             * 事件类型
             * </pre>
             *
             * <code>int32 event = 4;</code>
             */
            public int getEvent() {
                return event_;
            }
            /**
             * <pre>
             * 事件类型
             * </pre>
             *
             * <code>int32 event = 4;</code>
             */
            public Builder setEvent(int value) {

                event_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * 事件类型
             * </pre>
             *
             * <code>int32 event = 4;</code>
             */
            public Builder clearEvent() {

                event_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>string default = 5;</code>
             */
            public String getDefault() {
                Object ref = "";
                if (eventMessageCase_ == 5) {
                    ref = eventMessage_;
                }
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (eventMessageCase_ == 5) {
                        eventMessage_ = s;
                    }
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string default = 5;</code>
             */
            public com.google.protobuf.ByteString
            getDefaultBytes() {
                Object ref = "";
                if (eventMessageCase_ == 5) {
                    ref = eventMessage_;
                }
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    if (eventMessageCase_ == 5) {
                        eventMessage_ = b;
                    }
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string default = 5;</code>
             */
            public Builder setDefault(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                eventMessageCase_ = 5;
                eventMessage_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string default = 5;</code>
             */
            public Builder clearDefault() {
                if (eventMessageCase_ == 5) {
                    eventMessageCase_ = 0;
                    eventMessage_ = null;
                    onChanged();
                }
                return this;
            }
            /**
             * <code>string default = 5;</code>
             */
            public Builder setDefaultBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);
                eventMessageCase_ = 5;
                eventMessage_ = value;
                onChanged();
                return this;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.LoadSlideMessage, sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.Builder, sun.socket.pb.WhiteBroadMessages.LoadSlideMessageOrBuilder> loadSlideBuilder_;
            /**
             * <code>.sun.socket.pb.LoadSlideMessage loadSlide = 6;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.LoadSlideMessage getLoadSlide() {
                if (loadSlideBuilder_ == null) {
                    if (eventMessageCase_ == 6) {
                        return (sun.socket.pb.WhiteBroadMessages.LoadSlideMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.getDefaultInstance();
                } else {
                    if (eventMessageCase_ == 6) {
                        return loadSlideBuilder_.getMessage();
                    }
                    return sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.LoadSlideMessage loadSlide = 6;</code>
             */
            public Builder setLoadSlide(sun.socket.pb.WhiteBroadMessages.LoadSlideMessage value) {
                if (loadSlideBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eventMessage_ = value;
                    onChanged();
                } else {
                    loadSlideBuilder_.setMessage(value);
                }
                eventMessageCase_ = 6;
                return this;
            }
            /**
             * <code>.sun.socket.pb.LoadSlideMessage loadSlide = 6;</code>
             */
            public Builder setLoadSlide(
                    sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.Builder builderForValue) {
                if (loadSlideBuilder_ == null) {
                    eventMessage_ = builderForValue.build();
                    onChanged();
                } else {
                    loadSlideBuilder_.setMessage(builderForValue.build());
                }
                eventMessageCase_ = 6;
                return this;
            }
            /**
             * <code>.sun.socket.pb.LoadSlideMessage loadSlide = 6;</code>
             */
            public Builder mergeLoadSlide(sun.socket.pb.WhiteBroadMessages.LoadSlideMessage value) {
                if (loadSlideBuilder_ == null) {
                    if (eventMessageCase_ == 6 &&
                            eventMessage_ != sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.getDefaultInstance()) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.newBuilder((sun.socket.pb.WhiteBroadMessages.LoadSlideMessage) eventMessage_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        eventMessage_ = value;
                    }
                    onChanged();
                } else {
                    if (eventMessageCase_ == 6) {
                        loadSlideBuilder_.mergeFrom(value);
                    }
                    loadSlideBuilder_.setMessage(value);
                }
                eventMessageCase_ = 6;
                return this;
            }
            /**
             * <code>.sun.socket.pb.LoadSlideMessage loadSlide = 6;</code>
             */
            public Builder clearLoadSlide() {
                if (loadSlideBuilder_ == null) {
                    if (eventMessageCase_ == 6) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                        onChanged();
                    }
                } else {
                    if (eventMessageCase_ == 6) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                    }
                    loadSlideBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.sun.socket.pb.LoadSlideMessage loadSlide = 6;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.Builder getLoadSlideBuilder() {
                return getLoadSlideFieldBuilder().getBuilder();
            }
            /**
             * <code>.sun.socket.pb.LoadSlideMessage loadSlide = 6;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.LoadSlideMessageOrBuilder getLoadSlideOrBuilder() {
                if ((eventMessageCase_ == 6) && (loadSlideBuilder_ != null)) {
                    return loadSlideBuilder_.getMessageOrBuilder();
                } else {
                    if (eventMessageCase_ == 6) {
                        return (sun.socket.pb.WhiteBroadMessages.LoadSlideMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.LoadSlideMessage loadSlide = 6;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.LoadSlideMessage, sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.Builder, sun.socket.pb.WhiteBroadMessages.LoadSlideMessageOrBuilder>
            getLoadSlideFieldBuilder() {
                if (loadSlideBuilder_ == null) {
                    if (!(eventMessageCase_ == 6)) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.getDefaultInstance();
                    }
                    loadSlideBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            sun.socket.pb.WhiteBroadMessages.LoadSlideMessage, sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.Builder, sun.socket.pb.WhiteBroadMessages.LoadSlideMessageOrBuilder>(
                            (sun.socket.pb.WhiteBroadMessages.LoadSlideMessage) eventMessage_,
                            getParentForChildren(),
                            isClean());
                    eventMessage_ = null;
                }
                eventMessageCase_ = 6;
                onChanged();;
                return loadSlideBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage, sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.Builder, sun.socket.pb.WhiteBroadMessages.SwitchSlideMessageOrBuilder> switchSlideBuilder_;
            /**
             * <code>.sun.socket.pb.SwitchSlideMessage switchSlide = 7;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage getSwitchSlide() {
                if (switchSlideBuilder_ == null) {
                    if (eventMessageCase_ == 7) {
                        return (sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.getDefaultInstance();
                } else {
                    if (eventMessageCase_ == 7) {
                        return switchSlideBuilder_.getMessage();
                    }
                    return sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.SwitchSlideMessage switchSlide = 7;</code>
             */
            public Builder setSwitchSlide(sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage value) {
                if (switchSlideBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eventMessage_ = value;
                    onChanged();
                } else {
                    switchSlideBuilder_.setMessage(value);
                }
                eventMessageCase_ = 7;
                return this;
            }
            /**
             * <code>.sun.socket.pb.SwitchSlideMessage switchSlide = 7;</code>
             */
            public Builder setSwitchSlide(
                    sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.Builder builderForValue) {
                if (switchSlideBuilder_ == null) {
                    eventMessage_ = builderForValue.build();
                    onChanged();
                } else {
                    switchSlideBuilder_.setMessage(builderForValue.build());
                }
                eventMessageCase_ = 7;
                return this;
            }
            /**
             * <code>.sun.socket.pb.SwitchSlideMessage switchSlide = 7;</code>
             */
            public Builder mergeSwitchSlide(sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage value) {
                if (switchSlideBuilder_ == null) {
                    if (eventMessageCase_ == 7 &&
                            eventMessage_ != sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.getDefaultInstance()) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.newBuilder((sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage) eventMessage_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        eventMessage_ = value;
                    }
                    onChanged();
                } else {
                    if (eventMessageCase_ == 7) {
                        switchSlideBuilder_.mergeFrom(value);
                    }
                    switchSlideBuilder_.setMessage(value);
                }
                eventMessageCase_ = 7;
                return this;
            }
            /**
             * <code>.sun.socket.pb.SwitchSlideMessage switchSlide = 7;</code>
             */
            public Builder clearSwitchSlide() {
                if (switchSlideBuilder_ == null) {
                    if (eventMessageCase_ == 7) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                        onChanged();
                    }
                } else {
                    if (eventMessageCase_ == 7) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                    }
                    switchSlideBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.sun.socket.pb.SwitchSlideMessage switchSlide = 7;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.Builder getSwitchSlideBuilder() {
                return getSwitchSlideFieldBuilder().getBuilder();
            }
            /**
             * <code>.sun.socket.pb.SwitchSlideMessage switchSlide = 7;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.SwitchSlideMessageOrBuilder getSwitchSlideOrBuilder() {
                if ((eventMessageCase_ == 7) && (switchSlideBuilder_ != null)) {
                    return switchSlideBuilder_.getMessageOrBuilder();
                } else {
                    if (eventMessageCase_ == 7) {
                        return (sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.SwitchSlideMessage switchSlide = 7;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage, sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.Builder, sun.socket.pb.WhiteBroadMessages.SwitchSlideMessageOrBuilder>
            getSwitchSlideFieldBuilder() {
                if (switchSlideBuilder_ == null) {
                    if (!(eventMessageCase_ == 7)) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.getDefaultInstance();
                    }
                    switchSlideBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage, sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.Builder, sun.socket.pb.WhiteBroadMessages.SwitchSlideMessageOrBuilder>(
                            (sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage) eventMessage_,
                            getParentForChildren(),
                            isClean());
                    eventMessage_ = null;
                }
                eventMessageCase_ = 7;
                onChanged();;
                return switchSlideBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage, sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.Builder, sun.socket.pb.WhiteBroadMessages.ScrollSlideMessageOrBuilder> scrollSlideBuilder_;
            /**
             * <code>.sun.socket.pb.ScrollSlideMessage scrollSlide = 8;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage getScrollSlide() {
                if (scrollSlideBuilder_ == null) {
                    if (eventMessageCase_ == 8) {
                        return (sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.getDefaultInstance();
                } else {
                    if (eventMessageCase_ == 8) {
                        return scrollSlideBuilder_.getMessage();
                    }
                    return sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.ScrollSlideMessage scrollSlide = 8;</code>
             */
            public Builder setScrollSlide(sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage value) {
                if (scrollSlideBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eventMessage_ = value;
                    onChanged();
                } else {
                    scrollSlideBuilder_.setMessage(value);
                }
                eventMessageCase_ = 8;
                return this;
            }
            /**
             * <code>.sun.socket.pb.ScrollSlideMessage scrollSlide = 8;</code>
             */
            public Builder setScrollSlide(
                    sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.Builder builderForValue) {
                if (scrollSlideBuilder_ == null) {
                    eventMessage_ = builderForValue.build();
                    onChanged();
                } else {
                    scrollSlideBuilder_.setMessage(builderForValue.build());
                }
                eventMessageCase_ = 8;
                return this;
            }
            /**
             * <code>.sun.socket.pb.ScrollSlideMessage scrollSlide = 8;</code>
             */
            public Builder mergeScrollSlide(sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage value) {
                if (scrollSlideBuilder_ == null) {
                    if (eventMessageCase_ == 8 &&
                            eventMessage_ != sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.getDefaultInstance()) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.newBuilder((sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage) eventMessage_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        eventMessage_ = value;
                    }
                    onChanged();
                } else {
                    if (eventMessageCase_ == 8) {
                        scrollSlideBuilder_.mergeFrom(value);
                    }
                    scrollSlideBuilder_.setMessage(value);
                }
                eventMessageCase_ = 8;
                return this;
            }
            /**
             * <code>.sun.socket.pb.ScrollSlideMessage scrollSlide = 8;</code>
             */
            public Builder clearScrollSlide() {
                if (scrollSlideBuilder_ == null) {
                    if (eventMessageCase_ == 8) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                        onChanged();
                    }
                } else {
                    if (eventMessageCase_ == 8) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                    }
                    scrollSlideBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.sun.socket.pb.ScrollSlideMessage scrollSlide = 8;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.Builder getScrollSlideBuilder() {
                return getScrollSlideFieldBuilder().getBuilder();
            }
            /**
             * <code>.sun.socket.pb.ScrollSlideMessage scrollSlide = 8;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.ScrollSlideMessageOrBuilder getScrollSlideOrBuilder() {
                if ((eventMessageCase_ == 8) && (scrollSlideBuilder_ != null)) {
                    return scrollSlideBuilder_.getMessageOrBuilder();
                } else {
                    if (eventMessageCase_ == 8) {
                        return (sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.ScrollSlideMessage scrollSlide = 8;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage, sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.Builder, sun.socket.pb.WhiteBroadMessages.ScrollSlideMessageOrBuilder>
            getScrollSlideFieldBuilder() {
                if (scrollSlideBuilder_ == null) {
                    if (!(eventMessageCase_ == 8)) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.getDefaultInstance();
                    }
                    scrollSlideBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage, sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.Builder, sun.socket.pb.WhiteBroadMessages.ScrollSlideMessageOrBuilder>(
                            (sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage) eventMessage_,
                            getParentForChildren(),
                            isClean());
                    eventMessage_ = null;
                }
                eventMessageCase_ = 8;
                onChanged();;
                return scrollSlideBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.RotateSlideMessage, sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.Builder, sun.socket.pb.WhiteBroadMessages.RotateSlideMessageOrBuilder> rotateSlideBuilder_;
            /**
             * <code>.sun.socket.pb.RotateSlideMessage rotateSlide = 9;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.RotateSlideMessage getRotateSlide() {
                if (rotateSlideBuilder_ == null) {
                    if (eventMessageCase_ == 9) {
                        return (sun.socket.pb.WhiteBroadMessages.RotateSlideMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.getDefaultInstance();
                } else {
                    if (eventMessageCase_ == 9) {
                        return rotateSlideBuilder_.getMessage();
                    }
                    return sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.RotateSlideMessage rotateSlide = 9;</code>
             */
            public Builder setRotateSlide(sun.socket.pb.WhiteBroadMessages.RotateSlideMessage value) {
                if (rotateSlideBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eventMessage_ = value;
                    onChanged();
                } else {
                    rotateSlideBuilder_.setMessage(value);
                }
                eventMessageCase_ = 9;
                return this;
            }
            /**
             * <code>.sun.socket.pb.RotateSlideMessage rotateSlide = 9;</code>
             */
            public Builder setRotateSlide(
                    sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.Builder builderForValue) {
                if (rotateSlideBuilder_ == null) {
                    eventMessage_ = builderForValue.build();
                    onChanged();
                } else {
                    rotateSlideBuilder_.setMessage(builderForValue.build());
                }
                eventMessageCase_ = 9;
                return this;
            }
            /**
             * <code>.sun.socket.pb.RotateSlideMessage rotateSlide = 9;</code>
             */
            public Builder mergeRotateSlide(sun.socket.pb.WhiteBroadMessages.RotateSlideMessage value) {
                if (rotateSlideBuilder_ == null) {
                    if (eventMessageCase_ == 9 &&
                            eventMessage_ != sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.getDefaultInstance()) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.newBuilder((sun.socket.pb.WhiteBroadMessages.RotateSlideMessage) eventMessage_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        eventMessage_ = value;
                    }
                    onChanged();
                } else {
                    if (eventMessageCase_ == 9) {
                        rotateSlideBuilder_.mergeFrom(value);
                    }
                    rotateSlideBuilder_.setMessage(value);
                }
                eventMessageCase_ = 9;
                return this;
            }
            /**
             * <code>.sun.socket.pb.RotateSlideMessage rotateSlide = 9;</code>
             */
            public Builder clearRotateSlide() {
                if (rotateSlideBuilder_ == null) {
                    if (eventMessageCase_ == 9) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                        onChanged();
                    }
                } else {
                    if (eventMessageCase_ == 9) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                    }
                    rotateSlideBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.sun.socket.pb.RotateSlideMessage rotateSlide = 9;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.Builder getRotateSlideBuilder() {
                return getRotateSlideFieldBuilder().getBuilder();
            }
            /**
             * <code>.sun.socket.pb.RotateSlideMessage rotateSlide = 9;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.RotateSlideMessageOrBuilder getRotateSlideOrBuilder() {
                if ((eventMessageCase_ == 9) && (rotateSlideBuilder_ != null)) {
                    return rotateSlideBuilder_.getMessageOrBuilder();
                } else {
                    if (eventMessageCase_ == 9) {
                        return (sun.socket.pb.WhiteBroadMessages.RotateSlideMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.RotateSlideMessage rotateSlide = 9;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.RotateSlideMessage, sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.Builder, sun.socket.pb.WhiteBroadMessages.RotateSlideMessageOrBuilder>
            getRotateSlideFieldBuilder() {
                if (rotateSlideBuilder_ == null) {
                    if (!(eventMessageCase_ == 9)) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.getDefaultInstance();
                    }
                    rotateSlideBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            sun.socket.pb.WhiteBroadMessages.RotateSlideMessage, sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.Builder, sun.socket.pb.WhiteBroadMessages.RotateSlideMessageOrBuilder>(
                            (sun.socket.pb.WhiteBroadMessages.RotateSlideMessage) eventMessage_,
                            getParentForChildren(),
                            isClean());
                    eventMessage_ = null;
                }
                eventMessageCase_ = 9;
                onChanged();;
                return rotateSlideBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.LoadPPTMessage, sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.Builder, sun.socket.pb.WhiteBroadMessages.LoadPPTMessageOrBuilder> loadPPTBuilder_;
            /**
             * <code>.sun.socket.pb.LoadPPTMessage loadPPT = 10;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.LoadPPTMessage getLoadPPT() {
                if (loadPPTBuilder_ == null) {
                    if (eventMessageCase_ == 10) {
                        return (sun.socket.pb.WhiteBroadMessages.LoadPPTMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.getDefaultInstance();
                } else {
                    if (eventMessageCase_ == 10) {
                        return loadPPTBuilder_.getMessage();
                    }
                    return sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.LoadPPTMessage loadPPT = 10;</code>
             */
            public Builder setLoadPPT(sun.socket.pb.WhiteBroadMessages.LoadPPTMessage value) {
                if (loadPPTBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eventMessage_ = value;
                    onChanged();
                } else {
                    loadPPTBuilder_.setMessage(value);
                }
                eventMessageCase_ = 10;
                return this;
            }
            /**
             * <code>.sun.socket.pb.LoadPPTMessage loadPPT = 10;</code>
             */
            public Builder setLoadPPT(
                    sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.Builder builderForValue) {
                if (loadPPTBuilder_ == null) {
                    eventMessage_ = builderForValue.build();
                    onChanged();
                } else {
                    loadPPTBuilder_.setMessage(builderForValue.build());
                }
                eventMessageCase_ = 10;
                return this;
            }
            /**
             * <code>.sun.socket.pb.LoadPPTMessage loadPPT = 10;</code>
             */
            public Builder mergeLoadPPT(sun.socket.pb.WhiteBroadMessages.LoadPPTMessage value) {
                if (loadPPTBuilder_ == null) {
                    if (eventMessageCase_ == 10 &&
                            eventMessage_ != sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.getDefaultInstance()) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.newBuilder((sun.socket.pb.WhiteBroadMessages.LoadPPTMessage) eventMessage_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        eventMessage_ = value;
                    }
                    onChanged();
                } else {
                    if (eventMessageCase_ == 10) {
                        loadPPTBuilder_.mergeFrom(value);
                    }
                    loadPPTBuilder_.setMessage(value);
                }
                eventMessageCase_ = 10;
                return this;
            }
            /**
             * <code>.sun.socket.pb.LoadPPTMessage loadPPT = 10;</code>
             */
            public Builder clearLoadPPT() {
                if (loadPPTBuilder_ == null) {
                    if (eventMessageCase_ == 10) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                        onChanged();
                    }
                } else {
                    if (eventMessageCase_ == 10) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                    }
                    loadPPTBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.sun.socket.pb.LoadPPTMessage loadPPT = 10;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.Builder getLoadPPTBuilder() {
                return getLoadPPTFieldBuilder().getBuilder();
            }
            /**
             * <code>.sun.socket.pb.LoadPPTMessage loadPPT = 10;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.LoadPPTMessageOrBuilder getLoadPPTOrBuilder() {
                if ((eventMessageCase_ == 10) && (loadPPTBuilder_ != null)) {
                    return loadPPTBuilder_.getMessageOrBuilder();
                } else {
                    if (eventMessageCase_ == 10) {
                        return (sun.socket.pb.WhiteBroadMessages.LoadPPTMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.LoadPPTMessage loadPPT = 10;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.LoadPPTMessage, sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.Builder, sun.socket.pb.WhiteBroadMessages.LoadPPTMessageOrBuilder>
            getLoadPPTFieldBuilder() {
                if (loadPPTBuilder_ == null) {
                    if (!(eventMessageCase_ == 10)) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.getDefaultInstance();
                    }
                    loadPPTBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            sun.socket.pb.WhiteBroadMessages.LoadPPTMessage, sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.Builder, sun.socket.pb.WhiteBroadMessages.LoadPPTMessageOrBuilder>(
                            (sun.socket.pb.WhiteBroadMessages.LoadPPTMessage) eventMessage_,
                            getParentForChildren(),
                            isClean());
                    eventMessage_ = null;
                }
                eventMessageCase_ = 10;
                onChanged();;
                return loadPPTBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.BrushMessage, sun.socket.pb.WhiteBroadMessages.BrushMessage.Builder, sun.socket.pb.WhiteBroadMessages.BrushMessageOrBuilder> brushBuilder_;
            /**
             * <code>.sun.socket.pb.BrushMessage brush = 11;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.BrushMessage getBrush() {
                if (brushBuilder_ == null) {
                    if (eventMessageCase_ == 11) {
                        return (sun.socket.pb.WhiteBroadMessages.BrushMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.BrushMessage.getDefaultInstance();
                } else {
                    if (eventMessageCase_ == 11) {
                        return brushBuilder_.getMessage();
                    }
                    return sun.socket.pb.WhiteBroadMessages.BrushMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.BrushMessage brush = 11;</code>
             */
            public Builder setBrush(sun.socket.pb.WhiteBroadMessages.BrushMessage value) {
                if (brushBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eventMessage_ = value;
                    onChanged();
                } else {
                    brushBuilder_.setMessage(value);
                }
                eventMessageCase_ = 11;
                return this;
            }
            /**
             * <code>.sun.socket.pb.BrushMessage brush = 11;</code>
             */
            public Builder setBrush(
                    sun.socket.pb.WhiteBroadMessages.BrushMessage.Builder builderForValue) {
                if (brushBuilder_ == null) {
                    eventMessage_ = builderForValue.build();
                    onChanged();
                } else {
                    brushBuilder_.setMessage(builderForValue.build());
                }
                eventMessageCase_ = 11;
                return this;
            }
            /**
             * <code>.sun.socket.pb.BrushMessage brush = 11;</code>
             */
            public Builder mergeBrush(sun.socket.pb.WhiteBroadMessages.BrushMessage value) {
                if (brushBuilder_ == null) {
                    if (eventMessageCase_ == 11 &&
                            eventMessage_ != sun.socket.pb.WhiteBroadMessages.BrushMessage.getDefaultInstance()) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.BrushMessage.newBuilder((sun.socket.pb.WhiteBroadMessages.BrushMessage) eventMessage_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        eventMessage_ = value;
                    }
                    onChanged();
                } else {
                    if (eventMessageCase_ == 11) {
                        brushBuilder_.mergeFrom(value);
                    }
                    brushBuilder_.setMessage(value);
                }
                eventMessageCase_ = 11;
                return this;
            }
            /**
             * <code>.sun.socket.pb.BrushMessage brush = 11;</code>
             */
            public Builder clearBrush() {
                if (brushBuilder_ == null) {
                    if (eventMessageCase_ == 11) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                        onChanged();
                    }
                } else {
                    if (eventMessageCase_ == 11) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                    }
                    brushBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.sun.socket.pb.BrushMessage brush = 11;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.BrushMessage.Builder getBrushBuilder() {
                return getBrushFieldBuilder().getBuilder();
            }
            /**
             * <code>.sun.socket.pb.BrushMessage brush = 11;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.BrushMessageOrBuilder getBrushOrBuilder() {
                if ((eventMessageCase_ == 11) && (brushBuilder_ != null)) {
                    return brushBuilder_.getMessageOrBuilder();
                } else {
                    if (eventMessageCase_ == 11) {
                        return (sun.socket.pb.WhiteBroadMessages.BrushMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.BrushMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.BrushMessage brush = 11;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.BrushMessage, sun.socket.pb.WhiteBroadMessages.BrushMessage.Builder, sun.socket.pb.WhiteBroadMessages.BrushMessageOrBuilder>
            getBrushFieldBuilder() {
                if (brushBuilder_ == null) {
                    if (!(eventMessageCase_ == 11)) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.BrushMessage.getDefaultInstance();
                    }
                    brushBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            sun.socket.pb.WhiteBroadMessages.BrushMessage, sun.socket.pb.WhiteBroadMessages.BrushMessage.Builder, sun.socket.pb.WhiteBroadMessages.BrushMessageOrBuilder>(
                            (sun.socket.pb.WhiteBroadMessages.BrushMessage) eventMessage_,
                            getParentForChildren(),
                            isClean());
                    eventMessage_ = null;
                }
                eventMessageCase_ = 11;
                onChanged();;
                return brushBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.LineMessage, sun.socket.pb.WhiteBroadMessages.LineMessage.Builder, sun.socket.pb.WhiteBroadMessages.LineMessageOrBuilder> lineBuilder_;
            /**
             * <code>.sun.socket.pb.LineMessage line = 12;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.LineMessage getLine() {
                if (lineBuilder_ == null) {
                    if (eventMessageCase_ == 12) {
                        return (sun.socket.pb.WhiteBroadMessages.LineMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.LineMessage.getDefaultInstance();
                } else {
                    if (eventMessageCase_ == 12) {
                        return lineBuilder_.getMessage();
                    }
                    return sun.socket.pb.WhiteBroadMessages.LineMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.LineMessage line = 12;</code>
             */
            public Builder setLine(sun.socket.pb.WhiteBroadMessages.LineMessage value) {
                if (lineBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eventMessage_ = value;
                    onChanged();
                } else {
                    lineBuilder_.setMessage(value);
                }
                eventMessageCase_ = 12;
                return this;
            }
            /**
             * <code>.sun.socket.pb.LineMessage line = 12;</code>
             */
            public Builder setLine(
                    sun.socket.pb.WhiteBroadMessages.LineMessage.Builder builderForValue) {
                if (lineBuilder_ == null) {
                    eventMessage_ = builderForValue.build();
                    onChanged();
                } else {
                    lineBuilder_.setMessage(builderForValue.build());
                }
                eventMessageCase_ = 12;
                return this;
            }
            /**
             * <code>.sun.socket.pb.LineMessage line = 12;</code>
             */
            public Builder mergeLine(sun.socket.pb.WhiteBroadMessages.LineMessage value) {
                if (lineBuilder_ == null) {
                    if (eventMessageCase_ == 12 &&
                            eventMessage_ != sun.socket.pb.WhiteBroadMessages.LineMessage.getDefaultInstance()) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.LineMessage.newBuilder((sun.socket.pb.WhiteBroadMessages.LineMessage) eventMessage_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        eventMessage_ = value;
                    }
                    onChanged();
                } else {
                    if (eventMessageCase_ == 12) {
                        lineBuilder_.mergeFrom(value);
                    }
                    lineBuilder_.setMessage(value);
                }
                eventMessageCase_ = 12;
                return this;
            }
            /**
             * <code>.sun.socket.pb.LineMessage line = 12;</code>
             */
            public Builder clearLine() {
                if (lineBuilder_ == null) {
                    if (eventMessageCase_ == 12) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                        onChanged();
                    }
                } else {
                    if (eventMessageCase_ == 12) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                    }
                    lineBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.sun.socket.pb.LineMessage line = 12;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.LineMessage.Builder getLineBuilder() {
                return getLineFieldBuilder().getBuilder();
            }
            /**
             * <code>.sun.socket.pb.LineMessage line = 12;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.LineMessageOrBuilder getLineOrBuilder() {
                if ((eventMessageCase_ == 12) && (lineBuilder_ != null)) {
                    return lineBuilder_.getMessageOrBuilder();
                } else {
                    if (eventMessageCase_ == 12) {
                        return (sun.socket.pb.WhiteBroadMessages.LineMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.LineMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.LineMessage line = 12;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.LineMessage, sun.socket.pb.WhiteBroadMessages.LineMessage.Builder, sun.socket.pb.WhiteBroadMessages.LineMessageOrBuilder>
            getLineFieldBuilder() {
                if (lineBuilder_ == null) {
                    if (!(eventMessageCase_ == 12)) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.LineMessage.getDefaultInstance();
                    }
                    lineBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            sun.socket.pb.WhiteBroadMessages.LineMessage, sun.socket.pb.WhiteBroadMessages.LineMessage.Builder, sun.socket.pb.WhiteBroadMessages.LineMessageOrBuilder>(
                            (sun.socket.pb.WhiteBroadMessages.LineMessage) eventMessage_,
                            getParentForChildren(),
                            isClean());
                    eventMessage_ = null;
                }
                eventMessageCase_ = 12;
                onChanged();;
                return lineBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.EllipseMessage, sun.socket.pb.WhiteBroadMessages.EllipseMessage.Builder, sun.socket.pb.WhiteBroadMessages.EllipseMessageOrBuilder> ellipseBuilder_;
            /**
             * <code>.sun.socket.pb.EllipseMessage ellipse = 13;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.EllipseMessage getEllipse() {
                if (ellipseBuilder_ == null) {
                    if (eventMessageCase_ == 13) {
                        return (sun.socket.pb.WhiteBroadMessages.EllipseMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.EllipseMessage.getDefaultInstance();
                } else {
                    if (eventMessageCase_ == 13) {
                        return ellipseBuilder_.getMessage();
                    }
                    return sun.socket.pb.WhiteBroadMessages.EllipseMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.EllipseMessage ellipse = 13;</code>
             */
            public Builder setEllipse(sun.socket.pb.WhiteBroadMessages.EllipseMessage value) {
                if (ellipseBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eventMessage_ = value;
                    onChanged();
                } else {
                    ellipseBuilder_.setMessage(value);
                }
                eventMessageCase_ = 13;
                return this;
            }
            /**
             * <code>.sun.socket.pb.EllipseMessage ellipse = 13;</code>
             */
            public Builder setEllipse(
                    sun.socket.pb.WhiteBroadMessages.EllipseMessage.Builder builderForValue) {
                if (ellipseBuilder_ == null) {
                    eventMessage_ = builderForValue.build();
                    onChanged();
                } else {
                    ellipseBuilder_.setMessage(builderForValue.build());
                }
                eventMessageCase_ = 13;
                return this;
            }
            /**
             * <code>.sun.socket.pb.EllipseMessage ellipse = 13;</code>
             */
            public Builder mergeEllipse(sun.socket.pb.WhiteBroadMessages.EllipseMessage value) {
                if (ellipseBuilder_ == null) {
                    if (eventMessageCase_ == 13 &&
                            eventMessage_ != sun.socket.pb.WhiteBroadMessages.EllipseMessage.getDefaultInstance()) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.EllipseMessage.newBuilder((sun.socket.pb.WhiteBroadMessages.EllipseMessage) eventMessage_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        eventMessage_ = value;
                    }
                    onChanged();
                } else {
                    if (eventMessageCase_ == 13) {
                        ellipseBuilder_.mergeFrom(value);
                    }
                    ellipseBuilder_.setMessage(value);
                }
                eventMessageCase_ = 13;
                return this;
            }
            /**
             * <code>.sun.socket.pb.EllipseMessage ellipse = 13;</code>
             */
            public Builder clearEllipse() {
                if (ellipseBuilder_ == null) {
                    if (eventMessageCase_ == 13) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                        onChanged();
                    }
                } else {
                    if (eventMessageCase_ == 13) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                    }
                    ellipseBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.sun.socket.pb.EllipseMessage ellipse = 13;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.EllipseMessage.Builder getEllipseBuilder() {
                return getEllipseFieldBuilder().getBuilder();
            }
            /**
             * <code>.sun.socket.pb.EllipseMessage ellipse = 13;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.EllipseMessageOrBuilder getEllipseOrBuilder() {
                if ((eventMessageCase_ == 13) && (ellipseBuilder_ != null)) {
                    return ellipseBuilder_.getMessageOrBuilder();
                } else {
                    if (eventMessageCase_ == 13) {
                        return (sun.socket.pb.WhiteBroadMessages.EllipseMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.EllipseMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.EllipseMessage ellipse = 13;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.EllipseMessage, sun.socket.pb.WhiteBroadMessages.EllipseMessage.Builder, sun.socket.pb.WhiteBroadMessages.EllipseMessageOrBuilder>
            getEllipseFieldBuilder() {
                if (ellipseBuilder_ == null) {
                    if (!(eventMessageCase_ == 13)) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.EllipseMessage.getDefaultInstance();
                    }
                    ellipseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            sun.socket.pb.WhiteBroadMessages.EllipseMessage, sun.socket.pb.WhiteBroadMessages.EllipseMessage.Builder, sun.socket.pb.WhiteBroadMessages.EllipseMessageOrBuilder>(
                            (sun.socket.pb.WhiteBroadMessages.EllipseMessage) eventMessage_,
                            getParentForChildren(),
                            isClean());
                    eventMessage_ = null;
                }
                eventMessageCase_ = 13;
                onChanged();;
                return ellipseBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.TextToolMessage, sun.socket.pb.WhiteBroadMessages.TextToolMessage.Builder, sun.socket.pb.WhiteBroadMessages.TextToolMessageOrBuilder> textBuilder_;
            /**
             * <code>.sun.socket.pb.TextToolMessage text = 14;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.TextToolMessage getText() {
                if (textBuilder_ == null) {
                    if (eventMessageCase_ == 14) {
                        return (sun.socket.pb.WhiteBroadMessages.TextToolMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.TextToolMessage.getDefaultInstance();
                } else {
                    if (eventMessageCase_ == 14) {
                        return textBuilder_.getMessage();
                    }
                    return sun.socket.pb.WhiteBroadMessages.TextToolMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.TextToolMessage text = 14;</code>
             */
            public Builder setText(sun.socket.pb.WhiteBroadMessages.TextToolMessage value) {
                if (textBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eventMessage_ = value;
                    onChanged();
                } else {
                    textBuilder_.setMessage(value);
                }
                eventMessageCase_ = 14;
                return this;
            }
            /**
             * <code>.sun.socket.pb.TextToolMessage text = 14;</code>
             */
            public Builder setText(
                    sun.socket.pb.WhiteBroadMessages.TextToolMessage.Builder builderForValue) {
                if (textBuilder_ == null) {
                    eventMessage_ = builderForValue.build();
                    onChanged();
                } else {
                    textBuilder_.setMessage(builderForValue.build());
                }
                eventMessageCase_ = 14;
                return this;
            }
            /**
             * <code>.sun.socket.pb.TextToolMessage text = 14;</code>
             */
            public Builder mergeText(sun.socket.pb.WhiteBroadMessages.TextToolMessage value) {
                if (textBuilder_ == null) {
                    if (eventMessageCase_ == 14 &&
                            eventMessage_ != sun.socket.pb.WhiteBroadMessages.TextToolMessage.getDefaultInstance()) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.TextToolMessage.newBuilder((sun.socket.pb.WhiteBroadMessages.TextToolMessage) eventMessage_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        eventMessage_ = value;
                    }
                    onChanged();
                } else {
                    if (eventMessageCase_ == 14) {
                        textBuilder_.mergeFrom(value);
                    }
                    textBuilder_.setMessage(value);
                }
                eventMessageCase_ = 14;
                return this;
            }
            /**
             * <code>.sun.socket.pb.TextToolMessage text = 14;</code>
             */
            public Builder clearText() {
                if (textBuilder_ == null) {
                    if (eventMessageCase_ == 14) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                        onChanged();
                    }
                } else {
                    if (eventMessageCase_ == 14) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                    }
                    textBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.sun.socket.pb.TextToolMessage text = 14;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.TextToolMessage.Builder getTextBuilder() {
                return getTextFieldBuilder().getBuilder();
            }
            /**
             * <code>.sun.socket.pb.TextToolMessage text = 14;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.TextToolMessageOrBuilder getTextOrBuilder() {
                if ((eventMessageCase_ == 14) && (textBuilder_ != null)) {
                    return textBuilder_.getMessageOrBuilder();
                } else {
                    if (eventMessageCase_ == 14) {
                        return (sun.socket.pb.WhiteBroadMessages.TextToolMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.TextToolMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.TextToolMessage text = 14;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.TextToolMessage, sun.socket.pb.WhiteBroadMessages.TextToolMessage.Builder, sun.socket.pb.WhiteBroadMessages.TextToolMessageOrBuilder>
            getTextFieldBuilder() {
                if (textBuilder_ == null) {
                    if (!(eventMessageCase_ == 14)) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.TextToolMessage.getDefaultInstance();
                    }
                    textBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            sun.socket.pb.WhiteBroadMessages.TextToolMessage, sun.socket.pb.WhiteBroadMessages.TextToolMessage.Builder, sun.socket.pb.WhiteBroadMessages.TextToolMessageOrBuilder>(
                            (sun.socket.pb.WhiteBroadMessages.TextToolMessage) eventMessage_,
                            getParentForChildren(),
                            isClean());
                    eventMessage_ = null;
                }
                eventMessageCase_ = 14;
                onChanged();;
                return textBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.EraserMessage, sun.socket.pb.WhiteBroadMessages.EraserMessage.Builder, sun.socket.pb.WhiteBroadMessages.EraserMessageOrBuilder> eraserBuilder_;
            /**
             * <code>.sun.socket.pb.EraserMessage eraser = 15;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.EraserMessage getEraser() {
                if (eraserBuilder_ == null) {
                    if (eventMessageCase_ == 15) {
                        return (sun.socket.pb.WhiteBroadMessages.EraserMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.EraserMessage.getDefaultInstance();
                } else {
                    if (eventMessageCase_ == 15) {
                        return eraserBuilder_.getMessage();
                    }
                    return sun.socket.pb.WhiteBroadMessages.EraserMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.EraserMessage eraser = 15;</code>
             */
            public Builder setEraser(sun.socket.pb.WhiteBroadMessages.EraserMessage value) {
                if (eraserBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eventMessage_ = value;
                    onChanged();
                } else {
                    eraserBuilder_.setMessage(value);
                }
                eventMessageCase_ = 15;
                return this;
            }
            /**
             * <code>.sun.socket.pb.EraserMessage eraser = 15;</code>
             */
            public Builder setEraser(
                    sun.socket.pb.WhiteBroadMessages.EraserMessage.Builder builderForValue) {
                if (eraserBuilder_ == null) {
                    eventMessage_ = builderForValue.build();
                    onChanged();
                } else {
                    eraserBuilder_.setMessage(builderForValue.build());
                }
                eventMessageCase_ = 15;
                return this;
            }
            /**
             * <code>.sun.socket.pb.EraserMessage eraser = 15;</code>
             */
            public Builder mergeEraser(sun.socket.pb.WhiteBroadMessages.EraserMessage value) {
                if (eraserBuilder_ == null) {
                    if (eventMessageCase_ == 15 &&
                            eventMessage_ != sun.socket.pb.WhiteBroadMessages.EraserMessage.getDefaultInstance()) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.EraserMessage.newBuilder((sun.socket.pb.WhiteBroadMessages.EraserMessage) eventMessage_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        eventMessage_ = value;
                    }
                    onChanged();
                } else {
                    if (eventMessageCase_ == 15) {
                        eraserBuilder_.mergeFrom(value);
                    }
                    eraserBuilder_.setMessage(value);
                }
                eventMessageCase_ = 15;
                return this;
            }
            /**
             * <code>.sun.socket.pb.EraserMessage eraser = 15;</code>
             */
            public Builder clearEraser() {
                if (eraserBuilder_ == null) {
                    if (eventMessageCase_ == 15) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                        onChanged();
                    }
                } else {
                    if (eventMessageCase_ == 15) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                    }
                    eraserBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.sun.socket.pb.EraserMessage eraser = 15;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.EraserMessage.Builder getEraserBuilder() {
                return getEraserFieldBuilder().getBuilder();
            }
            /**
             * <code>.sun.socket.pb.EraserMessage eraser = 15;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.EraserMessageOrBuilder getEraserOrBuilder() {
                if ((eventMessageCase_ == 15) && (eraserBuilder_ != null)) {
                    return eraserBuilder_.getMessageOrBuilder();
                } else {
                    if (eventMessageCase_ == 15) {
                        return (sun.socket.pb.WhiteBroadMessages.EraserMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.EraserMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.EraserMessage eraser = 15;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.EraserMessage, sun.socket.pb.WhiteBroadMessages.EraserMessage.Builder, sun.socket.pb.WhiteBroadMessages.EraserMessageOrBuilder>
            getEraserFieldBuilder() {
                if (eraserBuilder_ == null) {
                    if (!(eventMessageCase_ == 15)) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.EraserMessage.getDefaultInstance();
                    }
                    eraserBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            sun.socket.pb.WhiteBroadMessages.EraserMessage, sun.socket.pb.WhiteBroadMessages.EraserMessage.Builder, sun.socket.pb.WhiteBroadMessages.EraserMessageOrBuilder>(
                            (sun.socket.pb.WhiteBroadMessages.EraserMessage) eventMessage_,
                            getParentForChildren(),
                            isClean());
                    eventMessage_ = null;
                }
                eventMessageCase_ = 15;
                onChanged();;
                return eraserBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage, sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.Builder, sun.socket.pb.WhiteBroadMessages.EraserRectangleMessageOrBuilder> eraserRectangleBuilder_;
            /**
             * <code>.sun.socket.pb.EraserRectangleMessage eraserRectangle = 16;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage getEraserRectangle() {
                if (eraserRectangleBuilder_ == null) {
                    if (eventMessageCase_ == 16) {
                        return (sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.getDefaultInstance();
                } else {
                    if (eventMessageCase_ == 16) {
                        return eraserRectangleBuilder_.getMessage();
                    }
                    return sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.EraserRectangleMessage eraserRectangle = 16;</code>
             */
            public Builder setEraserRectangle(sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage value) {
                if (eraserRectangleBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eventMessage_ = value;
                    onChanged();
                } else {
                    eraserRectangleBuilder_.setMessage(value);
                }
                eventMessageCase_ = 16;
                return this;
            }
            /**
             * <code>.sun.socket.pb.EraserRectangleMessage eraserRectangle = 16;</code>
             */
            public Builder setEraserRectangle(
                    sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.Builder builderForValue) {
                if (eraserRectangleBuilder_ == null) {
                    eventMessage_ = builderForValue.build();
                    onChanged();
                } else {
                    eraserRectangleBuilder_.setMessage(builderForValue.build());
                }
                eventMessageCase_ = 16;
                return this;
            }
            /**
             * <code>.sun.socket.pb.EraserRectangleMessage eraserRectangle = 16;</code>
             */
            public Builder mergeEraserRectangle(sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage value) {
                if (eraserRectangleBuilder_ == null) {
                    if (eventMessageCase_ == 16 &&
                            eventMessage_ != sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.getDefaultInstance()) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.newBuilder((sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage) eventMessage_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        eventMessage_ = value;
                    }
                    onChanged();
                } else {
                    if (eventMessageCase_ == 16) {
                        eraserRectangleBuilder_.mergeFrom(value);
                    }
                    eraserRectangleBuilder_.setMessage(value);
                }
                eventMessageCase_ = 16;
                return this;
            }
            /**
             * <code>.sun.socket.pb.EraserRectangleMessage eraserRectangle = 16;</code>
             */
            public Builder clearEraserRectangle() {
                if (eraserRectangleBuilder_ == null) {
                    if (eventMessageCase_ == 16) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                        onChanged();
                    }
                } else {
                    if (eventMessageCase_ == 16) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                    }
                    eraserRectangleBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.sun.socket.pb.EraserRectangleMessage eraserRectangle = 16;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.Builder getEraserRectangleBuilder() {
                return getEraserRectangleFieldBuilder().getBuilder();
            }
            /**
             * <code>.sun.socket.pb.EraserRectangleMessage eraserRectangle = 16;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.EraserRectangleMessageOrBuilder getEraserRectangleOrBuilder() {
                if ((eventMessageCase_ == 16) && (eraserRectangleBuilder_ != null)) {
                    return eraserRectangleBuilder_.getMessageOrBuilder();
                } else {
                    if (eventMessageCase_ == 16) {
                        return (sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.EraserRectangleMessage eraserRectangle = 16;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage, sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.Builder, sun.socket.pb.WhiteBroadMessages.EraserRectangleMessageOrBuilder>
            getEraserRectangleFieldBuilder() {
                if (eraserRectangleBuilder_ == null) {
                    if (!(eventMessageCase_ == 16)) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.getDefaultInstance();
                    }
                    eraserRectangleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage, sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.Builder, sun.socket.pb.WhiteBroadMessages.EraserRectangleMessageOrBuilder>(
                            (sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage) eventMessage_,
                            getParentForChildren(),
                            isClean());
                    eventMessage_ = null;
                }
                eventMessageCase_ = 16;
                onChanged();;
                return eraserRectangleBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.LineArrowMessage, sun.socket.pb.WhiteBroadMessages.LineArrowMessage.Builder, sun.socket.pb.WhiteBroadMessages.LineArrowMessageOrBuilder> lineArrowBuilder_;
            /**
             * <code>.sun.socket.pb.LineArrowMessage lineArrow = 17;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.LineArrowMessage getLineArrow() {
                if (lineArrowBuilder_ == null) {
                    if (eventMessageCase_ == 17) {
                        return (sun.socket.pb.WhiteBroadMessages.LineArrowMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.LineArrowMessage.getDefaultInstance();
                } else {
                    if (eventMessageCase_ == 17) {
                        return lineArrowBuilder_.getMessage();
                    }
                    return sun.socket.pb.WhiteBroadMessages.LineArrowMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.LineArrowMessage lineArrow = 17;</code>
             */
            public Builder setLineArrow(sun.socket.pb.WhiteBroadMessages.LineArrowMessage value) {
                if (lineArrowBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eventMessage_ = value;
                    onChanged();
                } else {
                    lineArrowBuilder_.setMessage(value);
                }
                eventMessageCase_ = 17;
                return this;
            }
            /**
             * <code>.sun.socket.pb.LineArrowMessage lineArrow = 17;</code>
             */
            public Builder setLineArrow(
                    sun.socket.pb.WhiteBroadMessages.LineArrowMessage.Builder builderForValue) {
                if (lineArrowBuilder_ == null) {
                    eventMessage_ = builderForValue.build();
                    onChanged();
                } else {
                    lineArrowBuilder_.setMessage(builderForValue.build());
                }
                eventMessageCase_ = 17;
                return this;
            }
            /**
             * <code>.sun.socket.pb.LineArrowMessage lineArrow = 17;</code>
             */
            public Builder mergeLineArrow(sun.socket.pb.WhiteBroadMessages.LineArrowMessage value) {
                if (lineArrowBuilder_ == null) {
                    if (eventMessageCase_ == 17 &&
                            eventMessage_ != sun.socket.pb.WhiteBroadMessages.LineArrowMessage.getDefaultInstance()) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.LineArrowMessage.newBuilder((sun.socket.pb.WhiteBroadMessages.LineArrowMessage) eventMessage_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        eventMessage_ = value;
                    }
                    onChanged();
                } else {
                    if (eventMessageCase_ == 17) {
                        lineArrowBuilder_.mergeFrom(value);
                    }
                    lineArrowBuilder_.setMessage(value);
                }
                eventMessageCase_ = 17;
                return this;
            }
            /**
             * <code>.sun.socket.pb.LineArrowMessage lineArrow = 17;</code>
             */
            public Builder clearLineArrow() {
                if (lineArrowBuilder_ == null) {
                    if (eventMessageCase_ == 17) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                        onChanged();
                    }
                } else {
                    if (eventMessageCase_ == 17) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                    }
                    lineArrowBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.sun.socket.pb.LineArrowMessage lineArrow = 17;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.LineArrowMessage.Builder getLineArrowBuilder() {
                return getLineArrowFieldBuilder().getBuilder();
            }
            /**
             * <code>.sun.socket.pb.LineArrowMessage lineArrow = 17;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.LineArrowMessageOrBuilder getLineArrowOrBuilder() {
                if ((eventMessageCase_ == 17) && (lineArrowBuilder_ != null)) {
                    return lineArrowBuilder_.getMessageOrBuilder();
                } else {
                    if (eventMessageCase_ == 17) {
                        return (sun.socket.pb.WhiteBroadMessages.LineArrowMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.LineArrowMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.LineArrowMessage lineArrow = 17;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.LineArrowMessage, sun.socket.pb.WhiteBroadMessages.LineArrowMessage.Builder, sun.socket.pb.WhiteBroadMessages.LineArrowMessageOrBuilder>
            getLineArrowFieldBuilder() {
                if (lineArrowBuilder_ == null) {
                    if (!(eventMessageCase_ == 17)) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.LineArrowMessage.getDefaultInstance();
                    }
                    lineArrowBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            sun.socket.pb.WhiteBroadMessages.LineArrowMessage, sun.socket.pb.WhiteBroadMessages.LineArrowMessage.Builder, sun.socket.pb.WhiteBroadMessages.LineArrowMessageOrBuilder>(
                            (sun.socket.pb.WhiteBroadMessages.LineArrowMessage) eventMessage_,
                            getParentForChildren(),
                            isClean());
                    eventMessage_ = null;
                }
                eventMessageCase_ = 17;
                onChanged();;
                return lineArrowBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.TriangleMessage, sun.socket.pb.WhiteBroadMessages.TriangleMessage.Builder, sun.socket.pb.WhiteBroadMessages.TriangleMessageOrBuilder> triangleBuilder_;
            /**
             * <code>.sun.socket.pb.TriangleMessage triangle = 18;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.TriangleMessage getTriangle() {
                if (triangleBuilder_ == null) {
                    if (eventMessageCase_ == 18) {
                        return (sun.socket.pb.WhiteBroadMessages.TriangleMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.TriangleMessage.getDefaultInstance();
                } else {
                    if (eventMessageCase_ == 18) {
                        return triangleBuilder_.getMessage();
                    }
                    return sun.socket.pb.WhiteBroadMessages.TriangleMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.TriangleMessage triangle = 18;</code>
             */
            public Builder setTriangle(sun.socket.pb.WhiteBroadMessages.TriangleMessage value) {
                if (triangleBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eventMessage_ = value;
                    onChanged();
                } else {
                    triangleBuilder_.setMessage(value);
                }
                eventMessageCase_ = 18;
                return this;
            }
            /**
             * <code>.sun.socket.pb.TriangleMessage triangle = 18;</code>
             */
            public Builder setTriangle(
                    sun.socket.pb.WhiteBroadMessages.TriangleMessage.Builder builderForValue) {
                if (triangleBuilder_ == null) {
                    eventMessage_ = builderForValue.build();
                    onChanged();
                } else {
                    triangleBuilder_.setMessage(builderForValue.build());
                }
                eventMessageCase_ = 18;
                return this;
            }
            /**
             * <code>.sun.socket.pb.TriangleMessage triangle = 18;</code>
             */
            public Builder mergeTriangle(sun.socket.pb.WhiteBroadMessages.TriangleMessage value) {
                if (triangleBuilder_ == null) {
                    if (eventMessageCase_ == 18 &&
                            eventMessage_ != sun.socket.pb.WhiteBroadMessages.TriangleMessage.getDefaultInstance()) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.TriangleMessage.newBuilder((sun.socket.pb.WhiteBroadMessages.TriangleMessage) eventMessage_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        eventMessage_ = value;
                    }
                    onChanged();
                } else {
                    if (eventMessageCase_ == 18) {
                        triangleBuilder_.mergeFrom(value);
                    }
                    triangleBuilder_.setMessage(value);
                }
                eventMessageCase_ = 18;
                return this;
            }
            /**
             * <code>.sun.socket.pb.TriangleMessage triangle = 18;</code>
             */
            public Builder clearTriangle() {
                if (triangleBuilder_ == null) {
                    if (eventMessageCase_ == 18) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                        onChanged();
                    }
                } else {
                    if (eventMessageCase_ == 18) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                    }
                    triangleBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.sun.socket.pb.TriangleMessage triangle = 18;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.TriangleMessage.Builder getTriangleBuilder() {
                return getTriangleFieldBuilder().getBuilder();
            }
            /**
             * <code>.sun.socket.pb.TriangleMessage triangle = 18;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.TriangleMessageOrBuilder getTriangleOrBuilder() {
                if ((eventMessageCase_ == 18) && (triangleBuilder_ != null)) {
                    return triangleBuilder_.getMessageOrBuilder();
                } else {
                    if (eventMessageCase_ == 18) {
                        return (sun.socket.pb.WhiteBroadMessages.TriangleMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.TriangleMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.TriangleMessage triangle = 18;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.TriangleMessage, sun.socket.pb.WhiteBroadMessages.TriangleMessage.Builder, sun.socket.pb.WhiteBroadMessages.TriangleMessageOrBuilder>
            getTriangleFieldBuilder() {
                if (triangleBuilder_ == null) {
                    if (!(eventMessageCase_ == 18)) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.TriangleMessage.getDefaultInstance();
                    }
                    triangleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            sun.socket.pb.WhiteBroadMessages.TriangleMessage, sun.socket.pb.WhiteBroadMessages.TriangleMessage.Builder, sun.socket.pb.WhiteBroadMessages.TriangleMessageOrBuilder>(
                            (sun.socket.pb.WhiteBroadMessages.TriangleMessage) eventMessage_,
                            getParentForChildren(),
                            isClean());
                    eventMessage_ = null;
                }
                eventMessageCase_ = 18;
                onChanged();;
                return triangleBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.StartMessage, sun.socket.pb.WhiteBroadMessages.StartMessage.Builder, sun.socket.pb.WhiteBroadMessages.StartMessageOrBuilder> startBuilder_;
            /**
             * <code>.sun.socket.pb.StartMessage start = 19;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.StartMessage getStart() {
                if (startBuilder_ == null) {
                    if (eventMessageCase_ == 19) {
                        return (sun.socket.pb.WhiteBroadMessages.StartMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.StartMessage.getDefaultInstance();
                } else {
                    if (eventMessageCase_ == 19) {
                        return startBuilder_.getMessage();
                    }
                    return sun.socket.pb.WhiteBroadMessages.StartMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.StartMessage start = 19;</code>
             */
            public Builder setStart(sun.socket.pb.WhiteBroadMessages.StartMessage value) {
                if (startBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eventMessage_ = value;
                    onChanged();
                } else {
                    startBuilder_.setMessage(value);
                }
                eventMessageCase_ = 19;
                return this;
            }
            /**
             * <code>.sun.socket.pb.StartMessage start = 19;</code>
             */
            public Builder setStart(
                    sun.socket.pb.WhiteBroadMessages.StartMessage.Builder builderForValue) {
                if (startBuilder_ == null) {
                    eventMessage_ = builderForValue.build();
                    onChanged();
                } else {
                    startBuilder_.setMessage(builderForValue.build());
                }
                eventMessageCase_ = 19;
                return this;
            }
            /**
             * <code>.sun.socket.pb.StartMessage start = 19;</code>
             */
            public Builder mergeStart(sun.socket.pb.WhiteBroadMessages.StartMessage value) {
                if (startBuilder_ == null) {
                    if (eventMessageCase_ == 19 &&
                            eventMessage_ != sun.socket.pb.WhiteBroadMessages.StartMessage.getDefaultInstance()) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.StartMessage.newBuilder((sun.socket.pb.WhiteBroadMessages.StartMessage) eventMessage_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        eventMessage_ = value;
                    }
                    onChanged();
                } else {
                    if (eventMessageCase_ == 19) {
                        startBuilder_.mergeFrom(value);
                    }
                    startBuilder_.setMessage(value);
                }
                eventMessageCase_ = 19;
                return this;
            }
            /**
             * <code>.sun.socket.pb.StartMessage start = 19;</code>
             */
            public Builder clearStart() {
                if (startBuilder_ == null) {
                    if (eventMessageCase_ == 19) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                        onChanged();
                    }
                } else {
                    if (eventMessageCase_ == 19) {
                        eventMessageCase_ = 0;
                        eventMessage_ = null;
                    }
                    startBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.sun.socket.pb.StartMessage start = 19;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.StartMessage.Builder getStartBuilder() {
                return getStartFieldBuilder().getBuilder();
            }
            /**
             * <code>.sun.socket.pb.StartMessage start = 19;</code>
             */
            public sun.socket.pb.WhiteBroadMessages.StartMessageOrBuilder getStartOrBuilder() {
                if ((eventMessageCase_ == 19) && (startBuilder_ != null)) {
                    return startBuilder_.getMessageOrBuilder();
                } else {
                    if (eventMessageCase_ == 19) {
                        return (sun.socket.pb.WhiteBroadMessages.StartMessage) eventMessage_;
                    }
                    return sun.socket.pb.WhiteBroadMessages.StartMessage.getDefaultInstance();
                }
            }
            /**
             * <code>.sun.socket.pb.StartMessage start = 19;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    sun.socket.pb.WhiteBroadMessages.StartMessage, sun.socket.pb.WhiteBroadMessages.StartMessage.Builder, sun.socket.pb.WhiteBroadMessages.StartMessageOrBuilder>
            getStartFieldBuilder() {
                if (startBuilder_ == null) {
                    if (!(eventMessageCase_ == 19)) {
                        eventMessage_ = sun.socket.pb.WhiteBroadMessages.StartMessage.getDefaultInstance();
                    }
                    startBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            sun.socket.pb.WhiteBroadMessages.StartMessage, sun.socket.pb.WhiteBroadMessages.StartMessage.Builder, sun.socket.pb.WhiteBroadMessages.StartMessageOrBuilder>(
                            (sun.socket.pb.WhiteBroadMessages.StartMessage) eventMessage_,
                            getParentForChildren(),
                            isClean());
                    eventMessage_ = null;
                }
                eventMessageCase_ = 19;
                onChanged();;
                return startBuilder_;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.WhiteBroadMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.WhiteBroadMessage)
        private static final sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<WhiteBroadMessage>
                PARSER = new com.google.protobuf.AbstractParser<WhiteBroadMessage>() {
            public WhiteBroadMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new WhiteBroadMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<WhiteBroadMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<WhiteBroadMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.WhiteBroadMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface LoadSlideMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.LoadSlideMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string source = 1;</code>
         */
        String getSource();
        /**
         * <code>string source = 1;</code>
         */
        com.google.protobuf.ByteString
        getSourceBytes();

        /**
         * <code>int32 page = 2;</code>
         */
        int getPage();

        /**
         * <code>int32 ratio = 3;</code>
         */
        int getRatio();

        /**
         * <code>bool end = 4;</code>
         */
        boolean getEnd();
    }
    /**
     * <pre>
     * [0, 0, -1, "!load-slides", ["71f8dd4c66b90993becd3597548cfabc", 10, 0.71,"231"], true]
     * [0, 0, -1, "!load-slides", ["draftboard", 1, 1], true]
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.LoadSlideMessage}
     */
    public  static final class LoadSlideMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.LoadSlideMessage)
            LoadSlideMessageOrBuilder {
        // Use LoadSlideMessage.newBuilder() to construct.
        private LoadSlideMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private LoadSlideMessage() {
            source_ = "";
            page_ = 0;
            ratio_ = 0;
            end_ = false;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private LoadSlideMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            String s = input.readStringRequireUtf8();

                            source_ = s;
                            break;
                        }
                        case 16: {

                            page_ = input.readInt32();
                            break;
                        }
                        case 24: {

                            ratio_ = input.readInt32();
                            break;
                        }
                        case 32: {

                            end_ = input.readBool();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LoadSlideMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LoadSlideMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.class, sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.Builder.class);
        }

        public static final int SOURCE_FIELD_NUMBER = 1;
        private volatile Object source_;
        /**
         * <code>string source = 1;</code>
         */
        public String getSource() {
            Object ref = source_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                source_ = s;
                return s;
            }
        }
        /**
         * <code>string source = 1;</code>
         */
        public com.google.protobuf.ByteString
        getSourceBytes() {
            Object ref = source_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                source_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int PAGE_FIELD_NUMBER = 2;
        private int page_;
        /**
         * <code>int32 page = 2;</code>
         */
        public int getPage() {
            return page_;
        }

        public static final int RATIO_FIELD_NUMBER = 3;
        private int ratio_;
        /**
         * <code>int32 ratio = 3;</code>
         */
        public int getRatio() {
            return ratio_;
        }

        public static final int END_FIELD_NUMBER = 4;
        private boolean end_;
        /**
         * <code>bool end = 4;</code>
         */
        public boolean getEnd() {
            return end_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getSourceBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, source_);
            }
            if (page_ != 0) {
                output.writeInt32(2, page_);
            }
            if (ratio_ != 0) {
                output.writeInt32(3, ratio_);
            }
            if (end_ != false) {
                output.writeBool(4, end_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getSourceBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, source_);
            }
            if (page_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, page_);
            }
            if (ratio_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, ratio_);
            }
            if (end_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(4, end_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.LoadSlideMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.LoadSlideMessage other = (sun.socket.pb.WhiteBroadMessages.LoadSlideMessage) obj;

            boolean result = true;
            result = result && getSource()
                    .equals(other.getSource());
            result = result && (getPage()
                    == other.getPage());
            result = result && (getRatio()
                    == other.getRatio());
            result = result && (getEnd()
                    == other.getEnd());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + SOURCE_FIELD_NUMBER;
            hash = (53 * hash) + getSource().hashCode();
            hash = (37 * hash) + PAGE_FIELD_NUMBER;
            hash = (53 * hash) + getPage();
            hash = (37 * hash) + RATIO_FIELD_NUMBER;
            hash = (53 * hash) + getRatio();
            hash = (37 * hash) + END_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getEnd());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.LoadSlideMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadSlideMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadSlideMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadSlideMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadSlideMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadSlideMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadSlideMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadSlideMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadSlideMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadSlideMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadSlideMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadSlideMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.LoadSlideMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * [0, 0, -1, "!load-slides", ["71f8dd4c66b90993becd3597548cfabc", 10, 0.71,"231"], true]
         * [0, 0, -1, "!load-slides", ["draftboard", 1, 1], true]
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.LoadSlideMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.LoadSlideMessage)
                sun.socket.pb.WhiteBroadMessages.LoadSlideMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LoadSlideMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LoadSlideMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.class, sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                source_ = "";

                page_ = 0;

                ratio_ = 0;

                end_ = false;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LoadSlideMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.LoadSlideMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.LoadSlideMessage build() {
                sun.socket.pb.WhiteBroadMessages.LoadSlideMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.LoadSlideMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.LoadSlideMessage result = new sun.socket.pb.WhiteBroadMessages.LoadSlideMessage(this);
                result.source_ = source_;
                result.page_ = page_;
                result.ratio_ = ratio_;
                result.end_ = end_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.LoadSlideMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.LoadSlideMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.LoadSlideMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.LoadSlideMessage.getDefaultInstance()) return this;
                if (!other.getSource().isEmpty()) {
                    source_ = other.source_;
                    onChanged();
                }
                if (other.getPage() != 0) {
                    setPage(other.getPage());
                }
                if (other.getRatio() != 0) {
                    setRatio(other.getRatio());
                }
                if (other.getEnd() != false) {
                    setEnd(other.getEnd());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.LoadSlideMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.LoadSlideMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private Object source_ = "";
            /**
             * <code>string source = 1;</code>
             */
            public String getSource() {
                Object ref = source_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    source_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string source = 1;</code>
             */
            public com.google.protobuf.ByteString
            getSourceBytes() {
                Object ref = source_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    source_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string source = 1;</code>
             */
            public Builder setSource(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                source_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string source = 1;</code>
             */
            public Builder clearSource() {

                source_ = getDefaultInstance().getSource();
                onChanged();
                return this;
            }
            /**
             * <code>string source = 1;</code>
             */
            public Builder setSourceBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                source_ = value;
                onChanged();
                return this;
            }

            private int page_ ;
            /**
             * <code>int32 page = 2;</code>
             */
            public int getPage() {
                return page_;
            }
            /**
             * <code>int32 page = 2;</code>
             */
            public Builder setPage(int value) {

                page_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 page = 2;</code>
             */
            public Builder clearPage() {

                page_ = 0;
                onChanged();
                return this;
            }

            private int ratio_ ;
            /**
             * <code>int32 ratio = 3;</code>
             */
            public int getRatio() {
                return ratio_;
            }
            /**
             * <code>int32 ratio = 3;</code>
             */
            public Builder setRatio(int value) {

                ratio_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 ratio = 3;</code>
             */
            public Builder clearRatio() {

                ratio_ = 0;
                onChanged();
                return this;
            }

            private boolean end_ ;
            /**
             * <code>bool end = 4;</code>
             */
            public boolean getEnd() {
                return end_;
            }
            /**
             * <code>bool end = 4;</code>
             */
            public Builder setEnd(boolean value) {

                end_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool end = 4;</code>
             */
            public Builder clearEnd() {

                end_ = false;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.LoadSlideMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.LoadSlideMessage)
        private static final sun.socket.pb.WhiteBroadMessages.LoadSlideMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.LoadSlideMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.LoadSlideMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<LoadSlideMessage>
                PARSER = new com.google.protobuf.AbstractParser<LoadSlideMessage>() {
            public LoadSlideMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new LoadSlideMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<LoadSlideMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<LoadSlideMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.LoadSlideMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface SwitchSlideMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.SwitchSlideMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 page = 1;</code>
         */
        int getPage();

        /**
         * <code>bool end = 2;</code>
         */
        boolean getEnd();
    }
    /**
     * <pre>
     * [0, 0, -1, "!switch-slide", [0], true]
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.SwitchSlideMessage}
     */
    public  static final class SwitchSlideMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.SwitchSlideMessage)
            SwitchSlideMessageOrBuilder {
        // Use SwitchSlideMessage.newBuilder() to construct.
        private SwitchSlideMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private SwitchSlideMessage() {
            page_ = 0;
            end_ = false;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private SwitchSlideMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            page_ = input.readInt32();
                            break;
                        }
                        case 16: {

                            end_ = input.readBool();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_SwitchSlideMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_SwitchSlideMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.class, sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.Builder.class);
        }

        public static final int PAGE_FIELD_NUMBER = 1;
        private int page_;
        /**
         * <code>int32 page = 1;</code>
         */
        public int getPage() {
            return page_;
        }

        public static final int END_FIELD_NUMBER = 2;
        private boolean end_;
        /**
         * <code>bool end = 2;</code>
         */
        public boolean getEnd() {
            return end_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (page_ != 0) {
                output.writeInt32(1, page_);
            }
            if (end_ != false) {
                output.writeBool(2, end_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (page_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, page_);
            }
            if (end_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(2, end_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage other = (sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage) obj;

            boolean result = true;
            result = result && (getPage()
                    == other.getPage());
            result = result && (getEnd()
                    == other.getEnd());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + PAGE_FIELD_NUMBER;
            hash = (53 * hash) + getPage();
            hash = (37 * hash) + END_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getEnd());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * [0, 0, -1, "!switch-slide", [0], true]
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.SwitchSlideMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.SwitchSlideMessage)
                sun.socket.pb.WhiteBroadMessages.SwitchSlideMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_SwitchSlideMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_SwitchSlideMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.class, sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                page_ = 0;

                end_ = false;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_SwitchSlideMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage build() {
                sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage result = new sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage(this);
                result.page_ = page_;
                result.end_ = end_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage.getDefaultInstance()) return this;
                if (other.getPage() != 0) {
                    setPage(other.getPage());
                }
                if (other.getEnd() != false) {
                    setEnd(other.getEnd());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int page_ ;
            /**
             * <code>int32 page = 1;</code>
             */
            public int getPage() {
                return page_;
            }
            /**
             * <code>int32 page = 1;</code>
             */
            public Builder setPage(int value) {

                page_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 page = 1;</code>
             */
            public Builder clearPage() {

                page_ = 0;
                onChanged();
                return this;
            }

            private boolean end_ ;
            /**
             * <code>bool end = 2;</code>
             */
            public boolean getEnd() {
                return end_;
            }
            /**
             * <code>bool end = 2;</code>
             */
            public Builder setEnd(boolean value) {

                end_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool end = 2;</code>
             */
            public Builder clearEnd() {

                end_ = false;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.SwitchSlideMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.SwitchSlideMessage)
        private static final sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<SwitchSlideMessage>
                PARSER = new com.google.protobuf.AbstractParser<SwitchSlideMessage>() {
            public SwitchSlideMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new SwitchSlideMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<SwitchSlideMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<SwitchSlideMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.SwitchSlideMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface ScrollSlideMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.ScrollSlideMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 move = 1;</code>
         */
        int getMove();

        /**
         * <code>bool end = 2;</code>
         */
        boolean getEnd();
    }
    /**
     * <pre>
     * [0, 0, -1, "!scroll-slide", [-200], true]
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.ScrollSlideMessage}
     */
    public  static final class ScrollSlideMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.ScrollSlideMessage)
            ScrollSlideMessageOrBuilder {
        // Use ScrollSlideMessage.newBuilder() to construct.
        private ScrollSlideMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private ScrollSlideMessage() {
            move_ = 0;
            end_ = false;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private ScrollSlideMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            move_ = input.readInt32();
                            break;
                        }
                        case 16: {

                            end_ = input.readBool();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_ScrollSlideMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_ScrollSlideMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.class, sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.Builder.class);
        }

        public static final int MOVE_FIELD_NUMBER = 1;
        private int move_;
        /**
         * <code>int32 move = 1;</code>
         */
        public int getMove() {
            return move_;
        }

        public static final int END_FIELD_NUMBER = 2;
        private boolean end_;
        /**
         * <code>bool end = 2;</code>
         */
        public boolean getEnd() {
            return end_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (move_ != 0) {
                output.writeInt32(1, move_);
            }
            if (end_ != false) {
                output.writeBool(2, end_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (move_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, move_);
            }
            if (end_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(2, end_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage other = (sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage) obj;

            boolean result = true;
            result = result && (getMove()
                    == other.getMove());
            result = result && (getEnd()
                    == other.getEnd());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + MOVE_FIELD_NUMBER;
            hash = (53 * hash) + getMove();
            hash = (37 * hash) + END_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getEnd());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * [0, 0, -1, "!scroll-slide", [-200], true]
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.ScrollSlideMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.ScrollSlideMessage)
                sun.socket.pb.WhiteBroadMessages.ScrollSlideMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_ScrollSlideMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_ScrollSlideMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.class, sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                move_ = 0;

                end_ = false;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_ScrollSlideMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage build() {
                sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage result = new sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage(this);
                result.move_ = move_;
                result.end_ = end_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage.getDefaultInstance()) return this;
                if (other.getMove() != 0) {
                    setMove(other.getMove());
                }
                if (other.getEnd() != false) {
                    setEnd(other.getEnd());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int move_ ;
            /**
             * <code>int32 move = 1;</code>
             */
            public int getMove() {
                return move_;
            }
            /**
             * <code>int32 move = 1;</code>
             */
            public Builder setMove(int value) {

                move_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 move = 1;</code>
             */
            public Builder clearMove() {

                move_ = 0;
                onChanged();
                return this;
            }

            private boolean end_ ;
            /**
             * <code>bool end = 2;</code>
             */
            public boolean getEnd() {
                return end_;
            }
            /**
             * <code>bool end = 2;</code>
             */
            public Builder setEnd(boolean value) {

                end_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool end = 2;</code>
             */
            public Builder clearEnd() {

                end_ = false;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.ScrollSlideMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.ScrollSlideMessage)
        private static final sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ScrollSlideMessage>
                PARSER = new com.google.protobuf.AbstractParser<ScrollSlideMessage>() {
            public ScrollSlideMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new ScrollSlideMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<ScrollSlideMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<ScrollSlideMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.ScrollSlideMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface RotateSlideMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.RotateSlideMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 rotation = 1;</code>
         */
        int getRotation();

        /**
         * <code>bool end = 3;</code>
         */
        boolean getEnd();
    }
    /**
     * <pre>
     * [0, 0, -1, "!rotate-slide", [90], true]
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.RotateSlideMessage}
     */
    public  static final class RotateSlideMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.RotateSlideMessage)
            RotateSlideMessageOrBuilder {
        // Use RotateSlideMessage.newBuilder() to construct.
        private RotateSlideMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private RotateSlideMessage() {
            rotation_ = 0;
            end_ = false;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private RotateSlideMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            rotation_ = input.readInt32();
                            break;
                        }
                        case 24: {

                            end_ = input.readBool();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_RotateSlideMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_RotateSlideMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.class, sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.Builder.class);
        }

        public static final int ROTATION_FIELD_NUMBER = 1;
        private int rotation_;
        /**
         * <code>int32 rotation = 1;</code>
         */
        public int getRotation() {
            return rotation_;
        }

        public static final int END_FIELD_NUMBER = 3;
        private boolean end_;
        /**
         * <code>bool end = 3;</code>
         */
        public boolean getEnd() {
            return end_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (rotation_ != 0) {
                output.writeInt32(1, rotation_);
            }
            if (end_ != false) {
                output.writeBool(3, end_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (rotation_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, rotation_);
            }
            if (end_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(3, end_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.RotateSlideMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.RotateSlideMessage other = (sun.socket.pb.WhiteBroadMessages.RotateSlideMessage) obj;

            boolean result = true;
            result = result && (getRotation()
                    == other.getRotation());
            result = result && (getEnd()
                    == other.getEnd());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ROTATION_FIELD_NUMBER;
            hash = (53 * hash) + getRotation();
            hash = (37 * hash) + END_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getEnd());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.RotateSlideMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.RotateSlideMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.RotateSlideMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.RotateSlideMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.RotateSlideMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.RotateSlideMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.RotateSlideMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.RotateSlideMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.RotateSlideMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.RotateSlideMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.RotateSlideMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.RotateSlideMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.RotateSlideMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * [0, 0, -1, "!rotate-slide", [90], true]
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.RotateSlideMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.RotateSlideMessage)
                sun.socket.pb.WhiteBroadMessages.RotateSlideMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_RotateSlideMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_RotateSlideMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.class, sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                rotation_ = 0;

                end_ = false;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_RotateSlideMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.RotateSlideMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.RotateSlideMessage build() {
                sun.socket.pb.WhiteBroadMessages.RotateSlideMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.RotateSlideMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.RotateSlideMessage result = new sun.socket.pb.WhiteBroadMessages.RotateSlideMessage(this);
                result.rotation_ = rotation_;
                result.end_ = end_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.RotateSlideMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.RotateSlideMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.RotateSlideMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.RotateSlideMessage.getDefaultInstance()) return this;
                if (other.getRotation() != 0) {
                    setRotation(other.getRotation());
                }
                if (other.getEnd() != false) {
                    setEnd(other.getEnd());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.RotateSlideMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.RotateSlideMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int rotation_ ;
            /**
             * <code>int32 rotation = 1;</code>
             */
            public int getRotation() {
                return rotation_;
            }
            /**
             * <code>int32 rotation = 1;</code>
             */
            public Builder setRotation(int value) {

                rotation_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 rotation = 1;</code>
             */
            public Builder clearRotation() {

                rotation_ = 0;
                onChanged();
                return this;
            }

            private boolean end_ ;
            /**
             * <code>bool end = 3;</code>
             */
            public boolean getEnd() {
                return end_;
            }
            /**
             * <code>bool end = 3;</code>
             */
            public Builder setEnd(boolean value) {

                end_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool end = 3;</code>
             */
            public Builder clearEnd() {

                end_ = false;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.RotateSlideMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.RotateSlideMessage)
        private static final sun.socket.pb.WhiteBroadMessages.RotateSlideMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.RotateSlideMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.RotateSlideMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<RotateSlideMessage>
                PARSER = new com.google.protobuf.AbstractParser<RotateSlideMessage>() {
            public RotateSlideMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new RotateSlideMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<RotateSlideMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<RotateSlideMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.RotateSlideMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface LoadPPTMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.LoadPPTMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string source = 1;</code>
         */
        String getSource();
        /**
         * <code>string source = 1;</code>
         */
        com.google.protobuf.ByteString
        getSourceBytes();

        /**
         * <code>int32 page = 2;</code>
         */
        int getPage();

        /**
         * <code>int32 ration = 3;</code>
         */
        int getRation();

        /**
         * <code>string pptName = 4;</code>
         */
        String getPptName();
        /**
         * <code>string pptName = 4;</code>
         */
        com.google.protobuf.ByteString
        getPptNameBytes();

        /**
         * <code>int32 ppyId = 5;</code>
         */
        int getPpyId();

        /**
         * <code>repeated int32 pptList = 6;</code>
         */
        java.util.List<Integer> getPptListList();
        /**
         * <code>repeated int32 pptList = 6;</code>
         */
        int getPptListCount();
        /**
         * <code>repeated int32 pptList = 6;</code>
         */
        int getPptList(int index);

        /**
         * <code>bool end = 7;</code>
         */
        boolean getEnd();
    }
    /**
     * <pre>
     *[0,0,-1,"!load-ppt",
     *[
     *"75bcaeda-8abc-41d2-9ecc-a2dfb13b8a47",
     *17,
     *1.33,
     *"第十讲-牛吃草问题2.ppt",
     *"1380967",
     *"[0,1,2,3,4,5,6,7,8,9,10,20170413,20170415,20170416,11,12,13,14,15,16]"
     *],true]
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.LoadPPTMessage}
     */
    public  static final class LoadPPTMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.LoadPPTMessage)
            LoadPPTMessageOrBuilder {
        // Use LoadPPTMessage.newBuilder() to construct.
        private LoadPPTMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private LoadPPTMessage() {
            source_ = "";
            page_ = 0;
            ration_ = 0;
            pptName_ = "";
            ppyId_ = 0;
            pptList_ = java.util.Collections.emptyList();
            end_ = false;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private LoadPPTMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            String s = input.readStringRequireUtf8();

                            source_ = s;
                            break;
                        }
                        case 16: {

                            page_ = input.readInt32();
                            break;
                        }
                        case 24: {

                            ration_ = input.readInt32();
                            break;
                        }
                        case 34: {
                            String s = input.readStringRequireUtf8();

                            pptName_ = s;
                            break;
                        }
                        case 40: {

                            ppyId_ = input.readInt32();
                            break;
                        }
                        case 48: {
                            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                                pptList_ = new java.util.ArrayList<Integer>();
                                mutable_bitField0_ |= 0x00000020;
                            }
                            pptList_.add(input.readInt32());
                            break;
                        }
                        case 50: {
                            int length = input.readRawVarint32();
                            int limit = input.pushLimit(length);
                            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020) && input.getBytesUntilLimit() > 0) {
                                pptList_ = new java.util.ArrayList<Integer>();
                                mutable_bitField0_ |= 0x00000020;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                pptList_.add(input.readInt32());
                            }
                            input.popLimit(limit);
                            break;
                        }
                        case 56: {

                            end_ = input.readBool();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                    pptList_ = java.util.Collections.unmodifiableList(pptList_);
                }
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LoadPPTMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LoadPPTMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.class, sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.Builder.class);
        }

        private int bitField0_;
        public static final int SOURCE_FIELD_NUMBER = 1;
        private volatile Object source_;
        /**
         * <code>string source = 1;</code>
         */
        public String getSource() {
            Object ref = source_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                source_ = s;
                return s;
            }
        }
        /**
         * <code>string source = 1;</code>
         */
        public com.google.protobuf.ByteString
        getSourceBytes() {
            Object ref = source_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                source_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int PAGE_FIELD_NUMBER = 2;
        private int page_;
        /**
         * <code>int32 page = 2;</code>
         */
        public int getPage() {
            return page_;
        }

        public static final int RATION_FIELD_NUMBER = 3;
        private int ration_;
        /**
         * <code>int32 ration = 3;</code>
         */
        public int getRation() {
            return ration_;
        }

        public static final int PPTNAME_FIELD_NUMBER = 4;
        private volatile Object pptName_;
        /**
         * <code>string pptName = 4;</code>
         */
        public String getPptName() {
            Object ref = pptName_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                pptName_ = s;
                return s;
            }
        }
        /**
         * <code>string pptName = 4;</code>
         */
        public com.google.protobuf.ByteString
        getPptNameBytes() {
            Object ref = pptName_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                pptName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int PPYID_FIELD_NUMBER = 5;
        private int ppyId_;
        /**
         * <code>int32 ppyId = 5;</code>
         */
        public int getPpyId() {
            return ppyId_;
        }

        public static final int PPTLIST_FIELD_NUMBER = 6;
        private java.util.List<Integer> pptList_;
        /**
         * <code>repeated int32 pptList = 6;</code>
         */
        public java.util.List<Integer>
        getPptListList() {
            return pptList_;
        }
        /**
         * <code>repeated int32 pptList = 6;</code>
         */
        public int getPptListCount() {
            return pptList_.size();
        }
        /**
         * <code>repeated int32 pptList = 6;</code>
         */
        public int getPptList(int index) {
            return pptList_.get(index);
        }
        private int pptListMemoizedSerializedSize = -1;

        public static final int END_FIELD_NUMBER = 7;
        private boolean end_;
        /**
         * <code>bool end = 7;</code>
         */
        public boolean getEnd() {
            return end_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (!getSourceBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, source_);
            }
            if (page_ != 0) {
                output.writeInt32(2, page_);
            }
            if (ration_ != 0) {
                output.writeInt32(3, ration_);
            }
            if (!getPptNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pptName_);
            }
            if (ppyId_ != 0) {
                output.writeInt32(5, ppyId_);
            }
            if (getPptListList().size() > 0) {
                output.writeUInt32NoTag(50);
                output.writeUInt32NoTag(pptListMemoizedSerializedSize);
            }
            for (int i = 0; i < pptList_.size(); i++) {
                output.writeInt32NoTag(pptList_.get(i));
            }
            if (end_ != false) {
                output.writeBool(7, end_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getSourceBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, source_);
            }
            if (page_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, page_);
            }
            if (ration_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, ration_);
            }
            if (!getPptNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pptName_);
            }
            if (ppyId_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(5, ppyId_);
            }
            {
                int dataSize = 0;
                for (int i = 0; i < pptList_.size(); i++) {
                    dataSize += com.google.protobuf.CodedOutputStream
                            .computeInt32SizeNoTag(pptList_.get(i));
                }
                size += dataSize;
                if (!getPptListList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32SizeNoTag(dataSize);
                }
                pptListMemoizedSerializedSize = dataSize;
            }
            if (end_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(7, end_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.LoadPPTMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.LoadPPTMessage other = (sun.socket.pb.WhiteBroadMessages.LoadPPTMessage) obj;

            boolean result = true;
            result = result && getSource()
                    .equals(other.getSource());
            result = result && (getPage()
                    == other.getPage());
            result = result && (getRation()
                    == other.getRation());
            result = result && getPptName()
                    .equals(other.getPptName());
            result = result && (getPpyId()
                    == other.getPpyId());
            result = result && getPptListList()
                    .equals(other.getPptListList());
            result = result && (getEnd()
                    == other.getEnd());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + SOURCE_FIELD_NUMBER;
            hash = (53 * hash) + getSource().hashCode();
            hash = (37 * hash) + PAGE_FIELD_NUMBER;
            hash = (53 * hash) + getPage();
            hash = (37 * hash) + RATION_FIELD_NUMBER;
            hash = (53 * hash) + getRation();
            hash = (37 * hash) + PPTNAME_FIELD_NUMBER;
            hash = (53 * hash) + getPptName().hashCode();
            hash = (37 * hash) + PPYID_FIELD_NUMBER;
            hash = (53 * hash) + getPpyId();
            if (getPptListCount() > 0) {
                hash = (37 * hash) + PPTLIST_FIELD_NUMBER;
                hash = (53 * hash) + getPptListList().hashCode();
            }
            hash = (37 * hash) + END_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getEnd());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.LoadPPTMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadPPTMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadPPTMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadPPTMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadPPTMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadPPTMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadPPTMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadPPTMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadPPTMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadPPTMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadPPTMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.LoadPPTMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.LoadPPTMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         *[0,0,-1,"!load-ppt",
         *[
         *"75bcaeda-8abc-41d2-9ecc-a2dfb13b8a47",
         *17,
         *1.33,
         *"第十讲-牛吃草问题2.ppt",
         *"1380967",
         *"[0,1,2,3,4,5,6,7,8,9,10,20170413,20170415,20170416,11,12,13,14,15,16]"
         *],true]
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.LoadPPTMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.LoadPPTMessage)
                sun.socket.pb.WhiteBroadMessages.LoadPPTMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LoadPPTMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LoadPPTMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.class, sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                source_ = "";

                page_ = 0;

                ration_ = 0;

                pptName_ = "";

                ppyId_ = 0;

                pptList_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000020);
                end_ = false;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LoadPPTMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.LoadPPTMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.LoadPPTMessage build() {
                sun.socket.pb.WhiteBroadMessages.LoadPPTMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.LoadPPTMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.LoadPPTMessage result = new sun.socket.pb.WhiteBroadMessages.LoadPPTMessage(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                result.source_ = source_;
                result.page_ = page_;
                result.ration_ = ration_;
                result.pptName_ = pptName_;
                result.ppyId_ = ppyId_;
                if (((bitField0_ & 0x00000020) == 0x00000020)) {
                    pptList_ = java.util.Collections.unmodifiableList(pptList_);
                    bitField0_ = (bitField0_ & ~0x00000020);
                }
                result.pptList_ = pptList_;
                result.end_ = end_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.LoadPPTMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.LoadPPTMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.LoadPPTMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.LoadPPTMessage.getDefaultInstance()) return this;
                if (!other.getSource().isEmpty()) {
                    source_ = other.source_;
                    onChanged();
                }
                if (other.getPage() != 0) {
                    setPage(other.getPage());
                }
                if (other.getRation() != 0) {
                    setRation(other.getRation());
                }
                if (!other.getPptName().isEmpty()) {
                    pptName_ = other.pptName_;
                    onChanged();
                }
                if (other.getPpyId() != 0) {
                    setPpyId(other.getPpyId());
                }
                if (!other.pptList_.isEmpty()) {
                    if (pptList_.isEmpty()) {
                        pptList_ = other.pptList_;
                        bitField0_ = (bitField0_ & ~0x00000020);
                    } else {
                        ensurePptListIsMutable();
                        pptList_.addAll(other.pptList_);
                    }
                    onChanged();
                }
                if (other.getEnd() != false) {
                    setEnd(other.getEnd());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.LoadPPTMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.LoadPPTMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private Object source_ = "";
            /**
             * <code>string source = 1;</code>
             */
            public String getSource() {
                Object ref = source_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    source_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string source = 1;</code>
             */
            public com.google.protobuf.ByteString
            getSourceBytes() {
                Object ref = source_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    source_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string source = 1;</code>
             */
            public Builder setSource(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                source_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string source = 1;</code>
             */
            public Builder clearSource() {

                source_ = getDefaultInstance().getSource();
                onChanged();
                return this;
            }
            /**
             * <code>string source = 1;</code>
             */
            public Builder setSourceBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                source_ = value;
                onChanged();
                return this;
            }

            private int page_ ;
            /**
             * <code>int32 page = 2;</code>
             */
            public int getPage() {
                return page_;
            }
            /**
             * <code>int32 page = 2;</code>
             */
            public Builder setPage(int value) {

                page_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 page = 2;</code>
             */
            public Builder clearPage() {

                page_ = 0;
                onChanged();
                return this;
            }

            private int ration_ ;
            /**
             * <code>int32 ration = 3;</code>
             */
            public int getRation() {
                return ration_;
            }
            /**
             * <code>int32 ration = 3;</code>
             */
            public Builder setRation(int value) {

                ration_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 ration = 3;</code>
             */
            public Builder clearRation() {

                ration_ = 0;
                onChanged();
                return this;
            }

            private Object pptName_ = "";
            /**
             * <code>string pptName = 4;</code>
             */
            public String getPptName() {
                Object ref = pptName_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    pptName_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string pptName = 4;</code>
             */
            public com.google.protobuf.ByteString
            getPptNameBytes() {
                Object ref = pptName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    pptName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string pptName = 4;</code>
             */
            public Builder setPptName(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                pptName_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string pptName = 4;</code>
             */
            public Builder clearPptName() {

                pptName_ = getDefaultInstance().getPptName();
                onChanged();
                return this;
            }
            /**
             * <code>string pptName = 4;</code>
             */
            public Builder setPptNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                pptName_ = value;
                onChanged();
                return this;
            }

            private int ppyId_ ;
            /**
             * <code>int32 ppyId = 5;</code>
             */
            public int getPpyId() {
                return ppyId_;
            }
            /**
             * <code>int32 ppyId = 5;</code>
             */
            public Builder setPpyId(int value) {

                ppyId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 ppyId = 5;</code>
             */
            public Builder clearPpyId() {

                ppyId_ = 0;
                onChanged();
                return this;
            }

            private java.util.List<Integer> pptList_ = java.util.Collections.emptyList();
            private void ensurePptListIsMutable() {
                if (!((bitField0_ & 0x00000020) == 0x00000020)) {
                    pptList_ = new java.util.ArrayList<Integer>(pptList_);
                    bitField0_ |= 0x00000020;
                }
            }
            /**
             * <code>repeated int32 pptList = 6;</code>
             */
            public java.util.List<Integer>
            getPptListList() {
                return java.util.Collections.unmodifiableList(pptList_);
            }
            /**
             * <code>repeated int32 pptList = 6;</code>
             */
            public int getPptListCount() {
                return pptList_.size();
            }
            /**
             * <code>repeated int32 pptList = 6;</code>
             */
            public int getPptList(int index) {
                return pptList_.get(index);
            }
            /**
             * <code>repeated int32 pptList = 6;</code>
             */
            public Builder setPptList(
                    int index, int value) {
                ensurePptListIsMutable();
                pptList_.set(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 pptList = 6;</code>
             */
            public Builder addPptList(int value) {
                ensurePptListIsMutable();
                pptList_.add(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 pptList = 6;</code>
             */
            public Builder addAllPptList(
                    Iterable<? extends Integer> values) {
                ensurePptListIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                        values, pptList_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 pptList = 6;</code>
             */
            public Builder clearPptList() {
                pptList_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000020);
                onChanged();
                return this;
            }

            private boolean end_ ;
            /**
             * <code>bool end = 7;</code>
             */
            public boolean getEnd() {
                return end_;
            }
            /**
             * <code>bool end = 7;</code>
             */
            public Builder setEnd(boolean value) {

                end_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool end = 7;</code>
             */
            public Builder clearEnd() {

                end_ = false;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.LoadPPTMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.LoadPPTMessage)
        private static final sun.socket.pb.WhiteBroadMessages.LoadPPTMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.LoadPPTMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.LoadPPTMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<LoadPPTMessage>
                PARSER = new com.google.protobuf.AbstractParser<LoadPPTMessage>() {
            public LoadPPTMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new LoadPPTMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<LoadPPTMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<LoadPPTMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.LoadPPTMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface BrushMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.BrushMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 width = 1;</code>
         */
        int getWidth();

        /**
         * <code>string color = 2;</code>
         */
        String getColor();
        /**
         * <code>string color = 2;</code>
         */
        com.google.protobuf.ByteString
        getColorBytes();
    }
    /**
     * <pre>
     * [252.7,178.2,1.1,"brush",[1,"#ed1941"]],[260.9,174.7,1.1], ...,[300.6,139.7,1.1,true]]
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.BrushMessage}
     */
    public  static final class BrushMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.BrushMessage)
            BrushMessageOrBuilder {
        // Use BrushMessage.newBuilder() to construct.
        private BrushMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private BrushMessage() {
            width_ = 0;
            color_ = "";
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private BrushMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            width_ = input.readInt32();
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            color_ = s;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_BrushMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_BrushMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.BrushMessage.class, sun.socket.pb.WhiteBroadMessages.BrushMessage.Builder.class);
        }

        public static final int WIDTH_FIELD_NUMBER = 1;
        private int width_;
        /**
         * <code>int32 width = 1;</code>
         */
        public int getWidth() {
            return width_;
        }

        public static final int COLOR_FIELD_NUMBER = 2;
        private volatile Object color_;
        /**
         * <code>string color = 2;</code>
         */
        public String getColor() {
            Object ref = color_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                color_ = s;
                return s;
            }
        }
        /**
         * <code>string color = 2;</code>
         */
        public com.google.protobuf.ByteString
        getColorBytes() {
            Object ref = color_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                color_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (width_ != 0) {
                output.writeInt32(1, width_);
            }
            if (!getColorBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, color_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (width_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, width_);
            }
            if (!getColorBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, color_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.BrushMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.BrushMessage other = (sun.socket.pb.WhiteBroadMessages.BrushMessage) obj;

            boolean result = true;
            result = result && (getWidth()
                    == other.getWidth());
            result = result && getColor()
                    .equals(other.getColor());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + WIDTH_FIELD_NUMBER;
            hash = (53 * hash) + getWidth();
            hash = (37 * hash) + COLOR_FIELD_NUMBER;
            hash = (53 * hash) + getColor().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.BrushMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.BrushMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.BrushMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.BrushMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.BrushMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.BrushMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.BrushMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.BrushMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.BrushMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.BrushMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.BrushMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.BrushMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.BrushMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * [252.7,178.2,1.1,"brush",[1,"#ed1941"]],[260.9,174.7,1.1], ...,[300.6,139.7,1.1,true]]
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.BrushMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.BrushMessage)
                sun.socket.pb.WhiteBroadMessages.BrushMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_BrushMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_BrushMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.BrushMessage.class, sun.socket.pb.WhiteBroadMessages.BrushMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.BrushMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                width_ = 0;

                color_ = "";

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_BrushMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.BrushMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.BrushMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.BrushMessage build() {
                sun.socket.pb.WhiteBroadMessages.BrushMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.BrushMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.BrushMessage result = new sun.socket.pb.WhiteBroadMessages.BrushMessage(this);
                result.width_ = width_;
                result.color_ = color_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.BrushMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.BrushMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.BrushMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.BrushMessage.getDefaultInstance()) return this;
                if (other.getWidth() != 0) {
                    setWidth(other.getWidth());
                }
                if (!other.getColor().isEmpty()) {
                    color_ = other.color_;
                    onChanged();
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.BrushMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.BrushMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int width_ ;
            /**
             * <code>int32 width = 1;</code>
             */
            public int getWidth() {
                return width_;
            }
            /**
             * <code>int32 width = 1;</code>
             */
            public Builder setWidth(int value) {

                width_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 width = 1;</code>
             */
            public Builder clearWidth() {

                width_ = 0;
                onChanged();
                return this;
            }

            private Object color_ = "";
            /**
             * <code>string color = 2;</code>
             */
            public String getColor() {
                Object ref = color_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    color_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string color = 2;</code>
             */
            public com.google.protobuf.ByteString
            getColorBytes() {
                Object ref = color_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    color_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder setColor(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                color_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder clearColor() {

                color_ = getDefaultInstance().getColor();
                onChanged();
                return this;
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder setColorBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                color_ = value;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.BrushMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.BrushMessage)
        private static final sun.socket.pb.WhiteBroadMessages.BrushMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.BrushMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.BrushMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<BrushMessage>
                PARSER = new com.google.protobuf.AbstractParser<BrushMessage>() {
            public BrushMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new BrushMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<BrushMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<BrushMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.BrushMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface LineMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.LineMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 width = 1;</code>
         */
        int getWidth();

        /**
         * <code>string color = 2;</code>
         */
        String getColor();
        /**
         * <code>string color = 2;</code>
         */
        com.google.protobuf.ByteString
        getColorBytes();

        /**
         * <code>int32 align = 3;</code>
         */
        int getAlign();
    }
    /**
     * <pre>
     * [173.4,148.7,4.1,"line",[1,"#ed1941",0]] ,[176.6,151.8,4.1],...,[332.3,312.3,4.1,true]
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.LineMessage}
     */
    public  static final class LineMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.LineMessage)
            LineMessageOrBuilder {
        // Use LineMessage.newBuilder() to construct.
        private LineMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private LineMessage() {
            width_ = 0;
            color_ = "";
            align_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private LineMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            width_ = input.readInt32();
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            color_ = s;
                            break;
                        }
                        case 24: {

                            align_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LineMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LineMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.LineMessage.class, sun.socket.pb.WhiteBroadMessages.LineMessage.Builder.class);
        }

        public static final int WIDTH_FIELD_NUMBER = 1;
        private int width_;
        /**
         * <code>int32 width = 1;</code>
         */
        public int getWidth() {
            return width_;
        }

        public static final int COLOR_FIELD_NUMBER = 2;
        private volatile Object color_;
        /**
         * <code>string color = 2;</code>
         */
        public String getColor() {
            Object ref = color_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                color_ = s;
                return s;
            }
        }
        /**
         * <code>string color = 2;</code>
         */
        public com.google.protobuf.ByteString
        getColorBytes() {
            Object ref = color_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                color_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int ALIGN_FIELD_NUMBER = 3;
        private int align_;
        /**
         * <code>int32 align = 3;</code>
         */
        public int getAlign() {
            return align_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (width_ != 0) {
                output.writeInt32(1, width_);
            }
            if (!getColorBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, color_);
            }
            if (align_ != 0) {
                output.writeInt32(3, align_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (width_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, width_);
            }
            if (!getColorBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, color_);
            }
            if (align_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, align_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.LineMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.LineMessage other = (sun.socket.pb.WhiteBroadMessages.LineMessage) obj;

            boolean result = true;
            result = result && (getWidth()
                    == other.getWidth());
            result = result && getColor()
                    .equals(other.getColor());
            result = result && (getAlign()
                    == other.getAlign());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + WIDTH_FIELD_NUMBER;
            hash = (53 * hash) + getWidth();
            hash = (37 * hash) + COLOR_FIELD_NUMBER;
            hash = (53 * hash) + getColor().hashCode();
            hash = (37 * hash) + ALIGN_FIELD_NUMBER;
            hash = (53 * hash) + getAlign();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.LineMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.LineMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * [173.4,148.7,4.1,"line",[1,"#ed1941",0]] ,[176.6,151.8,4.1],...,[332.3,312.3,4.1,true]
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.LineMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.LineMessage)
                sun.socket.pb.WhiteBroadMessages.LineMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LineMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LineMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.LineMessage.class, sun.socket.pb.WhiteBroadMessages.LineMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.LineMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                width_ = 0;

                color_ = "";

                align_ = 0;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LineMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.LineMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.LineMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.LineMessage build() {
                sun.socket.pb.WhiteBroadMessages.LineMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.LineMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.LineMessage result = new sun.socket.pb.WhiteBroadMessages.LineMessage(this);
                result.width_ = width_;
                result.color_ = color_;
                result.align_ = align_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.LineMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.LineMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.LineMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.LineMessage.getDefaultInstance()) return this;
                if (other.getWidth() != 0) {
                    setWidth(other.getWidth());
                }
                if (!other.getColor().isEmpty()) {
                    color_ = other.color_;
                    onChanged();
                }
                if (other.getAlign() != 0) {
                    setAlign(other.getAlign());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.LineMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.LineMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int width_ ;
            /**
             * <code>int32 width = 1;</code>
             */
            public int getWidth() {
                return width_;
            }
            /**
             * <code>int32 width = 1;</code>
             */
            public Builder setWidth(int value) {

                width_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 width = 1;</code>
             */
            public Builder clearWidth() {

                width_ = 0;
                onChanged();
                return this;
            }

            private Object color_ = "";
            /**
             * <code>string color = 2;</code>
             */
            public String getColor() {
                Object ref = color_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    color_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string color = 2;</code>
             */
            public com.google.protobuf.ByteString
            getColorBytes() {
                Object ref = color_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    color_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder setColor(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                color_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder clearColor() {

                color_ = getDefaultInstance().getColor();
                onChanged();
                return this;
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder setColorBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                color_ = value;
                onChanged();
                return this;
            }

            private int align_ ;
            /**
             * <code>int32 align = 3;</code>
             */
            public int getAlign() {
                return align_;
            }
            /**
             * <code>int32 align = 3;</code>
             */
            public Builder setAlign(int value) {

                align_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 align = 3;</code>
             */
            public Builder clearAlign() {

                align_ = 0;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.LineMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.LineMessage)
        private static final sun.socket.pb.WhiteBroadMessages.LineMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.LineMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.LineMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<LineMessage>
                PARSER = new com.google.protobuf.AbstractParser<LineMessage>() {
            public LineMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new LineMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<LineMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<LineMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.LineMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface EllipseMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.EllipseMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 width = 1;</code>
         */
        int getWidth();

        /**
         * <code>int32 fill = 2;</code>
         */
        int getFill();

        /**
         * <code>string color = 3;</code>
         */
        String getColor();
        /**
         * <code>string color = 3;</code>
         */
        com.google.protobuf.ByteString
        getColorBytes();

        /**
         * <code>int32 shift = 4;</code>
         */
        int getShift();
    }
    /**
     * <pre>
     * [444.1,662.5,9.1,"ellipse",[1,0,"#ed1941",0]],[444.4,665.6,9.1],...,[565.2,738.1,9.1,true]
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.EllipseMessage}
     */
    public  static final class EllipseMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.EllipseMessage)
            EllipseMessageOrBuilder {
        // Use EllipseMessage.newBuilder() to construct.
        private EllipseMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private EllipseMessage() {
            width_ = 0;
            fill_ = 0;
            color_ = "";
            shift_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private EllipseMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            width_ = input.readInt32();
                            break;
                        }
                        case 16: {

                            fill_ = input.readInt32();
                            break;
                        }
                        case 26: {
                            String s = input.readStringRequireUtf8();

                            color_ = s;
                            break;
                        }
                        case 32: {

                            shift_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EllipseMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EllipseMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.EllipseMessage.class, sun.socket.pb.WhiteBroadMessages.EllipseMessage.Builder.class);
        }

        public static final int WIDTH_FIELD_NUMBER = 1;
        private int width_;
        /**
         * <code>int32 width = 1;</code>
         */
        public int getWidth() {
            return width_;
        }

        public static final int FILL_FIELD_NUMBER = 2;
        private int fill_;
        /**
         * <code>int32 fill = 2;</code>
         */
        public int getFill() {
            return fill_;
        }

        public static final int COLOR_FIELD_NUMBER = 3;
        private volatile Object color_;
        /**
         * <code>string color = 3;</code>
         */
        public String getColor() {
            Object ref = color_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                color_ = s;
                return s;
            }
        }
        /**
         * <code>string color = 3;</code>
         */
        public com.google.protobuf.ByteString
        getColorBytes() {
            Object ref = color_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                color_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SHIFT_FIELD_NUMBER = 4;
        private int shift_;
        /**
         * <code>int32 shift = 4;</code>
         */
        public int getShift() {
            return shift_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (width_ != 0) {
                output.writeInt32(1, width_);
            }
            if (fill_ != 0) {
                output.writeInt32(2, fill_);
            }
            if (!getColorBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, color_);
            }
            if (shift_ != 0) {
                output.writeInt32(4, shift_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (width_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, width_);
            }
            if (fill_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, fill_);
            }
            if (!getColorBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, color_);
            }
            if (shift_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(4, shift_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.EllipseMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.EllipseMessage other = (sun.socket.pb.WhiteBroadMessages.EllipseMessage) obj;

            boolean result = true;
            result = result && (getWidth()
                    == other.getWidth());
            result = result && (getFill()
                    == other.getFill());
            result = result && getColor()
                    .equals(other.getColor());
            result = result && (getShift()
                    == other.getShift());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + WIDTH_FIELD_NUMBER;
            hash = (53 * hash) + getWidth();
            hash = (37 * hash) + FILL_FIELD_NUMBER;
            hash = (53 * hash) + getFill();
            hash = (37 * hash) + COLOR_FIELD_NUMBER;
            hash = (53 * hash) + getColor().hashCode();
            hash = (37 * hash) + SHIFT_FIELD_NUMBER;
            hash = (53 * hash) + getShift();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.EllipseMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.EllipseMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EllipseMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.EllipseMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EllipseMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.EllipseMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EllipseMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.EllipseMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EllipseMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.EllipseMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EllipseMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.EllipseMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.EllipseMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * [444.1,662.5,9.1,"ellipse",[1,0,"#ed1941",0]],[444.4,665.6,9.1],...,[565.2,738.1,9.1,true]
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.EllipseMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.EllipseMessage)
                sun.socket.pb.WhiteBroadMessages.EllipseMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EllipseMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EllipseMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.EllipseMessage.class, sun.socket.pb.WhiteBroadMessages.EllipseMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.EllipseMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                width_ = 0;

                fill_ = 0;

                color_ = "";

                shift_ = 0;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EllipseMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.EllipseMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.EllipseMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.EllipseMessage build() {
                sun.socket.pb.WhiteBroadMessages.EllipseMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.EllipseMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.EllipseMessage result = new sun.socket.pb.WhiteBroadMessages.EllipseMessage(this);
                result.width_ = width_;
                result.fill_ = fill_;
                result.color_ = color_;
                result.shift_ = shift_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.EllipseMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.EllipseMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.EllipseMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.EllipseMessage.getDefaultInstance()) return this;
                if (other.getWidth() != 0) {
                    setWidth(other.getWidth());
                }
                if (other.getFill() != 0) {
                    setFill(other.getFill());
                }
                if (!other.getColor().isEmpty()) {
                    color_ = other.color_;
                    onChanged();
                }
                if (other.getShift() != 0) {
                    setShift(other.getShift());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.EllipseMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.EllipseMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int width_ ;
            /**
             * <code>int32 width = 1;</code>
             */
            public int getWidth() {
                return width_;
            }
            /**
             * <code>int32 width = 1;</code>
             */
            public Builder setWidth(int value) {

                width_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 width = 1;</code>
             */
            public Builder clearWidth() {

                width_ = 0;
                onChanged();
                return this;
            }

            private int fill_ ;
            /**
             * <code>int32 fill = 2;</code>
             */
            public int getFill() {
                return fill_;
            }
            /**
             * <code>int32 fill = 2;</code>
             */
            public Builder setFill(int value) {

                fill_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 fill = 2;</code>
             */
            public Builder clearFill() {

                fill_ = 0;
                onChanged();
                return this;
            }

            private Object color_ = "";
            /**
             * <code>string color = 3;</code>
             */
            public String getColor() {
                Object ref = color_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    color_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string color = 3;</code>
             */
            public com.google.protobuf.ByteString
            getColorBytes() {
                Object ref = color_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    color_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string color = 3;</code>
             */
            public Builder setColor(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                color_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string color = 3;</code>
             */
            public Builder clearColor() {

                color_ = getDefaultInstance().getColor();
                onChanged();
                return this;
            }
            /**
             * <code>string color = 3;</code>
             */
            public Builder setColorBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                color_ = value;
                onChanged();
                return this;
            }

            private int shift_ ;
            /**
             * <code>int32 shift = 4;</code>
             */
            public int getShift() {
                return shift_;
            }
            /**
             * <code>int32 shift = 4;</code>
             */
            public Builder setShift(int value) {

                shift_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 shift = 4;</code>
             */
            public Builder clearShift() {

                shift_ = 0;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.EllipseMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.EllipseMessage)
        private static final sun.socket.pb.WhiteBroadMessages.EllipseMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.EllipseMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.EllipseMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<EllipseMessage>
                PARSER = new com.google.protobuf.AbstractParser<EllipseMessage>() {
            public EllipseMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new EllipseMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<EllipseMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<EllipseMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.EllipseMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface TextToolMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.TextToolMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 pixel = 1;</code>
         */
        int getPixel();

        /**
         * <code>string color = 2;</code>
         */
        String getColor();
        /**
         * <code>string color = 2;</code>
         */
        com.google.protobuf.ByteString
        getColorBytes();

        /**
         * <code>string content = 4;</code>
         */
        String getContent();
        /**
         * <code>string content = 4;</code>
         */
        com.google.protobuf.ByteString
        getContentBytes();
    }
    /**
     * <pre>
     * [536.9208041958042,772.620979020979,14.1,"texttool",[14,"#ed1941"],true,"aa曼联加油bb"]
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.TextToolMessage}
     */
    public  static final class TextToolMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.TextToolMessage)
            TextToolMessageOrBuilder {
        // Use TextToolMessage.newBuilder() to construct.
        private TextToolMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private TextToolMessage() {
            pixel_ = 0;
            color_ = "";
            content_ = "";
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private TextToolMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            pixel_ = input.readInt32();
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            color_ = s;
                            break;
                        }
                        case 34: {
                            String s = input.readStringRequireUtf8();

                            content_ = s;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_TextToolMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_TextToolMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.TextToolMessage.class, sun.socket.pb.WhiteBroadMessages.TextToolMessage.Builder.class);
        }

        public static final int PIXEL_FIELD_NUMBER = 1;
        private int pixel_;
        /**
         * <code>int32 pixel = 1;</code>
         */
        public int getPixel() {
            return pixel_;
        }

        public static final int COLOR_FIELD_NUMBER = 2;
        private volatile Object color_;
        /**
         * <code>string color = 2;</code>
         */
        public String getColor() {
            Object ref = color_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                color_ = s;
                return s;
            }
        }
        /**
         * <code>string color = 2;</code>
         */
        public com.google.protobuf.ByteString
        getColorBytes() {
            Object ref = color_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                color_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int CONTENT_FIELD_NUMBER = 4;
        private volatile Object content_;
        /**
         * <code>string content = 4;</code>
         */
        public String getContent() {
            Object ref = content_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                content_ = s;
                return s;
            }
        }
        /**
         * <code>string content = 4;</code>
         */
        public com.google.protobuf.ByteString
        getContentBytes() {
            Object ref = content_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                content_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (pixel_ != 0) {
                output.writeInt32(1, pixel_);
            }
            if (!getColorBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, color_);
            }
            if (!getContentBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, content_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (pixel_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, pixel_);
            }
            if (!getColorBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, color_);
            }
            if (!getContentBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, content_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.TextToolMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.TextToolMessage other = (sun.socket.pb.WhiteBroadMessages.TextToolMessage) obj;

            boolean result = true;
            result = result && (getPixel()
                    == other.getPixel());
            result = result && getColor()
                    .equals(other.getColor());
            result = result && getContent()
                    .equals(other.getContent());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + PIXEL_FIELD_NUMBER;
            hash = (53 * hash) + getPixel();
            hash = (37 * hash) + COLOR_FIELD_NUMBER;
            hash = (53 * hash) + getColor().hashCode();
            hash = (37 * hash) + CONTENT_FIELD_NUMBER;
            hash = (53 * hash) + getContent().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.TextToolMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.TextToolMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.TextToolMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.TextToolMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.TextToolMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.TextToolMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.TextToolMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.TextToolMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.TextToolMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.TextToolMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.TextToolMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.TextToolMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.TextToolMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * [536.9208041958042,772.620979020979,14.1,"texttool",[14,"#ed1941"],true,"aa曼联加油bb"]
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.TextToolMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.TextToolMessage)
                sun.socket.pb.WhiteBroadMessages.TextToolMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_TextToolMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_TextToolMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.TextToolMessage.class, sun.socket.pb.WhiteBroadMessages.TextToolMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.TextToolMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                pixel_ = 0;

                color_ = "";

                content_ = "";

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_TextToolMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.TextToolMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.TextToolMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.TextToolMessage build() {
                sun.socket.pb.WhiteBroadMessages.TextToolMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.TextToolMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.TextToolMessage result = new sun.socket.pb.WhiteBroadMessages.TextToolMessage(this);
                result.pixel_ = pixel_;
                result.color_ = color_;
                result.content_ = content_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.TextToolMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.TextToolMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.TextToolMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.TextToolMessage.getDefaultInstance()) return this;
                if (other.getPixel() != 0) {
                    setPixel(other.getPixel());
                }
                if (!other.getColor().isEmpty()) {
                    color_ = other.color_;
                    onChanged();
                }
                if (!other.getContent().isEmpty()) {
                    content_ = other.content_;
                    onChanged();
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.TextToolMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.TextToolMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int pixel_ ;
            /**
             * <code>int32 pixel = 1;</code>
             */
            public int getPixel() {
                return pixel_;
            }
            /**
             * <code>int32 pixel = 1;</code>
             */
            public Builder setPixel(int value) {

                pixel_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 pixel = 1;</code>
             */
            public Builder clearPixel() {

                pixel_ = 0;
                onChanged();
                return this;
            }

            private Object color_ = "";
            /**
             * <code>string color = 2;</code>
             */
            public String getColor() {
                Object ref = color_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    color_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string color = 2;</code>
             */
            public com.google.protobuf.ByteString
            getColorBytes() {
                Object ref = color_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    color_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder setColor(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                color_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder clearColor() {

                color_ = getDefaultInstance().getColor();
                onChanged();
                return this;
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder setColorBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                color_ = value;
                onChanged();
                return this;
            }

            private Object content_ = "";
            /**
             * <code>string content = 4;</code>
             */
            public String getContent() {
                Object ref = content_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    content_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string content = 4;</code>
             */
            public com.google.protobuf.ByteString
            getContentBytes() {
                Object ref = content_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    content_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string content = 4;</code>
             */
            public Builder setContent(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                content_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string content = 4;</code>
             */
            public Builder clearContent() {

                content_ = getDefaultInstance().getContent();
                onChanged();
                return this;
            }
            /**
             * <code>string content = 4;</code>
             */
            public Builder setContentBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                content_ = value;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.TextToolMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.TextToolMessage)
        private static final sun.socket.pb.WhiteBroadMessages.TextToolMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.TextToolMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.TextToolMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<TextToolMessage>
                PARSER = new com.google.protobuf.AbstractParser<TextToolMessage>() {
            public TextToolMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new TextToolMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<TextToolMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<TextToolMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.TextToolMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface EraserMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.EraserMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 deleteType = 1;</code>
         */
        int getDeleteType();
    }
    /**
     * <pre>
     * [445.6,659.3,15.1,"eraser",[10]],[451.9,675.1,15.1],...,[521.2,788.4,15.1,true]
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.EraserMessage}
     */
    public  static final class EraserMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.EraserMessage)
            EraserMessageOrBuilder {
        // Use EraserMessage.newBuilder() to construct.
        private EraserMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private EraserMessage() {
            deleteType_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private EraserMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            deleteType_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EraserMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EraserMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.EraserMessage.class, sun.socket.pb.WhiteBroadMessages.EraserMessage.Builder.class);
        }

        public static final int DELETETYPE_FIELD_NUMBER = 1;
        private int deleteType_;
        /**
         * <code>int32 deleteType = 1;</code>
         */
        public int getDeleteType() {
            return deleteType_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (deleteType_ != 0) {
                output.writeInt32(1, deleteType_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (deleteType_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, deleteType_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.EraserMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.EraserMessage other = (sun.socket.pb.WhiteBroadMessages.EraserMessage) obj;

            boolean result = true;
            result = result && (getDeleteType()
                    == other.getDeleteType());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + DELETETYPE_FIELD_NUMBER;
            hash = (53 * hash) + getDeleteType();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.EraserMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.EraserMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * [445.6,659.3,15.1,"eraser",[10]],[451.9,675.1,15.1],...,[521.2,788.4,15.1,true]
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.EraserMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.EraserMessage)
                sun.socket.pb.WhiteBroadMessages.EraserMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EraserMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EraserMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.EraserMessage.class, sun.socket.pb.WhiteBroadMessages.EraserMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.EraserMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                deleteType_ = 0;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EraserMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.EraserMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.EraserMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.EraserMessage build() {
                sun.socket.pb.WhiteBroadMessages.EraserMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.EraserMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.EraserMessage result = new sun.socket.pb.WhiteBroadMessages.EraserMessage(this);
                result.deleteType_ = deleteType_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.EraserMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.EraserMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.EraserMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.EraserMessage.getDefaultInstance()) return this;
                if (other.getDeleteType() != 0) {
                    setDeleteType(other.getDeleteType());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.EraserMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.EraserMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int deleteType_ ;
            /**
             * <code>int32 deleteType = 1;</code>
             */
            public int getDeleteType() {
                return deleteType_;
            }
            /**
             * <code>int32 deleteType = 1;</code>
             */
            public Builder setDeleteType(int value) {

                deleteType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 deleteType = 1;</code>
             */
            public Builder clearDeleteType() {

                deleteType_ = 0;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.EraserMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.EraserMessage)
        private static final sun.socket.pb.WhiteBroadMessages.EraserMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.EraserMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.EraserMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<EraserMessage>
                PARSER = new com.google.protobuf.AbstractParser<EraserMessage>() {
            public EraserMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new EraserMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<EraserMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<EraserMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.EraserMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface EraserRectangleMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.EraserRectangleMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 deleteType = 1;</code>
         */
        int getDeleteType();
    }
    /**
     * <pre>
     * [274.1,736.4,16.1,"eraserrectangle",[10]],[277.3,741.2,16.1],...,[422.1,846.6,16.1,true]
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.EraserRectangleMessage}
     */
    public  static final class EraserRectangleMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.EraserRectangleMessage)
            EraserRectangleMessageOrBuilder {
        // Use EraserRectangleMessage.newBuilder() to construct.
        private EraserRectangleMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private EraserRectangleMessage() {
            deleteType_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private EraserRectangleMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            deleteType_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EraserRectangleMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EraserRectangleMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.class, sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.Builder.class);
        }

        public static final int DELETETYPE_FIELD_NUMBER = 1;
        private int deleteType_;
        /**
         * <code>int32 deleteType = 1;</code>
         */
        public int getDeleteType() {
            return deleteType_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (deleteType_ != 0) {
                output.writeInt32(1, deleteType_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (deleteType_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, deleteType_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage other = (sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage) obj;

            boolean result = true;
            result = result && (getDeleteType()
                    == other.getDeleteType());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + DELETETYPE_FIELD_NUMBER;
            hash = (53 * hash) + getDeleteType();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * [274.1,736.4,16.1,"eraserrectangle",[10]],[277.3,741.2,16.1],...,[422.1,846.6,16.1,true]
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.EraserRectangleMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.EraserRectangleMessage)
                sun.socket.pb.WhiteBroadMessages.EraserRectangleMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EraserRectangleMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EraserRectangleMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.class, sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                deleteType_ = 0;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_EraserRectangleMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage build() {
                sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage result = new sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage(this);
                result.deleteType_ = deleteType_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage.getDefaultInstance()) return this;
                if (other.getDeleteType() != 0) {
                    setDeleteType(other.getDeleteType());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int deleteType_ ;
            /**
             * <code>int32 deleteType = 1;</code>
             */
            public int getDeleteType() {
                return deleteType_;
            }
            /**
             * <code>int32 deleteType = 1;</code>
             */
            public Builder setDeleteType(int value) {

                deleteType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 deleteType = 1;</code>
             */
            public Builder clearDeleteType() {

                deleteType_ = 0;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.EraserRectangleMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.EraserRectangleMessage)
        private static final sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<EraserRectangleMessage>
                PARSER = new com.google.protobuf.AbstractParser<EraserRectangleMessage>() {
            public EraserRectangleMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new EraserRectangleMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<EraserRectangleMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<EraserRectangleMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.EraserRectangleMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface LineArrowMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.LineArrowMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 width = 1;</code>
         */
        int getWidth();

        /**
         * <code>string color = 2;</code>
         */
        String getColor();
        /**
         * <code>string color = 2;</code>
         */
        com.google.protobuf.ByteString
        getColorBytes();

        /**
         * <code>int32 startX = 3;</code>
         */
        int getStartX();

        /**
         * <code>int32 startY = 4;</code>
         */
        int getStartY();
    }
    /**
     * <pre>
     * [85.71,349.45,1.2,"linearrow",[2,"#ed1941",513.3,237.3],true]
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.LineArrowMessage}
     */
    public  static final class LineArrowMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.LineArrowMessage)
            LineArrowMessageOrBuilder {
        // Use LineArrowMessage.newBuilder() to construct.
        private LineArrowMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private LineArrowMessage() {
            width_ = 0;
            color_ = "";
            startX_ = 0;
            startY_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private LineArrowMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            width_ = input.readInt32();
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            color_ = s;
                            break;
                        }
                        case 24: {

                            startX_ = input.readInt32();
                            break;
                        }
                        case 32: {

                            startY_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LineArrowMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LineArrowMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.LineArrowMessage.class, sun.socket.pb.WhiteBroadMessages.LineArrowMessage.Builder.class);
        }

        public static final int WIDTH_FIELD_NUMBER = 1;
        private int width_;
        /**
         * <code>int32 width = 1;</code>
         */
        public int getWidth() {
            return width_;
        }

        public static final int COLOR_FIELD_NUMBER = 2;
        private volatile Object color_;
        /**
         * <code>string color = 2;</code>
         */
        public String getColor() {
            Object ref = color_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                color_ = s;
                return s;
            }
        }
        /**
         * <code>string color = 2;</code>
         */
        public com.google.protobuf.ByteString
        getColorBytes() {
            Object ref = color_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                color_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int STARTX_FIELD_NUMBER = 3;
        private int startX_;
        /**
         * <code>int32 startX = 3;</code>
         */
        public int getStartX() {
            return startX_;
        }

        public static final int STARTY_FIELD_NUMBER = 4;
        private int startY_;
        /**
         * <code>int32 startY = 4;</code>
         */
        public int getStartY() {
            return startY_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (width_ != 0) {
                output.writeInt32(1, width_);
            }
            if (!getColorBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, color_);
            }
            if (startX_ != 0) {
                output.writeInt32(3, startX_);
            }
            if (startY_ != 0) {
                output.writeInt32(4, startY_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (width_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, width_);
            }
            if (!getColorBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, color_);
            }
            if (startX_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, startX_);
            }
            if (startY_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(4, startY_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.LineArrowMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.LineArrowMessage other = (sun.socket.pb.WhiteBroadMessages.LineArrowMessage) obj;

            boolean result = true;
            result = result && (getWidth()
                    == other.getWidth());
            result = result && getColor()
                    .equals(other.getColor());
            result = result && (getStartX()
                    == other.getStartX());
            result = result && (getStartY()
                    == other.getStartY());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + WIDTH_FIELD_NUMBER;
            hash = (53 * hash) + getWidth();
            hash = (37 * hash) + COLOR_FIELD_NUMBER;
            hash = (53 * hash) + getColor().hashCode();
            hash = (37 * hash) + STARTX_FIELD_NUMBER;
            hash = (53 * hash) + getStartX();
            hash = (37 * hash) + STARTY_FIELD_NUMBER;
            hash = (53 * hash) + getStartY();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.LineArrowMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineArrowMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineArrowMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineArrowMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineArrowMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineArrowMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineArrowMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineArrowMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineArrowMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineArrowMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineArrowMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.LineArrowMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.LineArrowMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * [85.71,349.45,1.2,"linearrow",[2,"#ed1941",513.3,237.3],true]
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.LineArrowMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.LineArrowMessage)
                sun.socket.pb.WhiteBroadMessages.LineArrowMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LineArrowMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LineArrowMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.LineArrowMessage.class, sun.socket.pb.WhiteBroadMessages.LineArrowMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.LineArrowMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                width_ = 0;

                color_ = "";

                startX_ = 0;

                startY_ = 0;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_LineArrowMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.LineArrowMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.LineArrowMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.LineArrowMessage build() {
                sun.socket.pb.WhiteBroadMessages.LineArrowMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.LineArrowMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.LineArrowMessage result = new sun.socket.pb.WhiteBroadMessages.LineArrowMessage(this);
                result.width_ = width_;
                result.color_ = color_;
                result.startX_ = startX_;
                result.startY_ = startY_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.LineArrowMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.LineArrowMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.LineArrowMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.LineArrowMessage.getDefaultInstance()) return this;
                if (other.getWidth() != 0) {
                    setWidth(other.getWidth());
                }
                if (!other.getColor().isEmpty()) {
                    color_ = other.color_;
                    onChanged();
                }
                if (other.getStartX() != 0) {
                    setStartX(other.getStartX());
                }
                if (other.getStartY() != 0) {
                    setStartY(other.getStartY());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.LineArrowMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.LineArrowMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int width_ ;
            /**
             * <code>int32 width = 1;</code>
             */
            public int getWidth() {
                return width_;
            }
            /**
             * <code>int32 width = 1;</code>
             */
            public Builder setWidth(int value) {

                width_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 width = 1;</code>
             */
            public Builder clearWidth() {

                width_ = 0;
                onChanged();
                return this;
            }

            private Object color_ = "";
            /**
             * <code>string color = 2;</code>
             */
            public String getColor() {
                Object ref = color_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    color_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string color = 2;</code>
             */
            public com.google.protobuf.ByteString
            getColorBytes() {
                Object ref = color_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    color_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder setColor(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                color_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder clearColor() {

                color_ = getDefaultInstance().getColor();
                onChanged();
                return this;
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder setColorBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                color_ = value;
                onChanged();
                return this;
            }

            private int startX_ ;
            /**
             * <code>int32 startX = 3;</code>
             */
            public int getStartX() {
                return startX_;
            }
            /**
             * <code>int32 startX = 3;</code>
             */
            public Builder setStartX(int value) {

                startX_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 startX = 3;</code>
             */
            public Builder clearStartX() {

                startX_ = 0;
                onChanged();
                return this;
            }

            private int startY_ ;
            /**
             * <code>int32 startY = 4;</code>
             */
            public int getStartY() {
                return startY_;
            }
            /**
             * <code>int32 startY = 4;</code>
             */
            public Builder setStartY(int value) {

                startY_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 startY = 4;</code>
             */
            public Builder clearStartY() {

                startY_ = 0;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.LineArrowMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.LineArrowMessage)
        private static final sun.socket.pb.WhiteBroadMessages.LineArrowMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.LineArrowMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.LineArrowMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<LineArrowMessage>
                PARSER = new com.google.protobuf.AbstractParser<LineArrowMessage>() {
            public LineArrowMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new LineArrowMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<LineArrowMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<LineArrowMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.LineArrowMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface TriangleMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.TriangleMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 width = 1;</code>
         */
        int getWidth();

        /**
         * <code>string color = 2;</code>
         */
        String getColor();
        /**
         * <code>string color = 2;</code>
         */
        com.google.protobuf.ByteString
        getColorBytes();

        /**
         * <code>int32 point2x = 3;</code>
         */
        int getPoint2X();

        /**
         * <code>int32 point2y = 4;</code>
         */
        int getPoint2Y();

        /**
         * <code>int32 point3x = 5;</code>
         */
        int getPoint3X();

        /**
         * <code>int32 point3y = 6;</code>
         */
        int getPoint3Y();
    }
    /**
     * <pre>
     * [226.9,115.3,1.7,"triangle",[2,"#ed1941",226.9,289.0,473.6,289.1],true]
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.TriangleMessage}
     */
    public  static final class TriangleMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.TriangleMessage)
            TriangleMessageOrBuilder {
        // Use TriangleMessage.newBuilder() to construct.
        private TriangleMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private TriangleMessage() {
            width_ = 0;
            color_ = "";
            point2X_ = 0;
            point2Y_ = 0;
            point3X_ = 0;
            point3Y_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private TriangleMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            width_ = input.readInt32();
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            color_ = s;
                            break;
                        }
                        case 24: {

                            point2X_ = input.readInt32();
                            break;
                        }
                        case 32: {

                            point2Y_ = input.readInt32();
                            break;
                        }
                        case 40: {

                            point3X_ = input.readInt32();
                            break;
                        }
                        case 48: {

                            point3Y_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_TriangleMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_TriangleMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.TriangleMessage.class, sun.socket.pb.WhiteBroadMessages.TriangleMessage.Builder.class);
        }

        public static final int WIDTH_FIELD_NUMBER = 1;
        private int width_;
        /**
         * <code>int32 width = 1;</code>
         */
        public int getWidth() {
            return width_;
        }

        public static final int COLOR_FIELD_NUMBER = 2;
        private volatile Object color_;
        /**
         * <code>string color = 2;</code>
         */
        public String getColor() {
            Object ref = color_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                color_ = s;
                return s;
            }
        }
        /**
         * <code>string color = 2;</code>
         */
        public com.google.protobuf.ByteString
        getColorBytes() {
            Object ref = color_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                color_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int POINT2X_FIELD_NUMBER = 3;
        private int point2X_;
        /**
         * <code>int32 point2x = 3;</code>
         */
        public int getPoint2X() {
            return point2X_;
        }

        public static final int POINT2Y_FIELD_NUMBER = 4;
        private int point2Y_;
        /**
         * <code>int32 point2y = 4;</code>
         */
        public int getPoint2Y() {
            return point2Y_;
        }

        public static final int POINT3X_FIELD_NUMBER = 5;
        private int point3X_;
        /**
         * <code>int32 point3x = 5;</code>
         */
        public int getPoint3X() {
            return point3X_;
        }

        public static final int POINT3Y_FIELD_NUMBER = 6;
        private int point3Y_;
        /**
         * <code>int32 point3y = 6;</code>
         */
        public int getPoint3Y() {
            return point3Y_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (width_ != 0) {
                output.writeInt32(1, width_);
            }
            if (!getColorBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, color_);
            }
            if (point2X_ != 0) {
                output.writeInt32(3, point2X_);
            }
            if (point2Y_ != 0) {
                output.writeInt32(4, point2Y_);
            }
            if (point3X_ != 0) {
                output.writeInt32(5, point3X_);
            }
            if (point3Y_ != 0) {
                output.writeInt32(6, point3Y_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (width_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, width_);
            }
            if (!getColorBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, color_);
            }
            if (point2X_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, point2X_);
            }
            if (point2Y_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(4, point2Y_);
            }
            if (point3X_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(5, point3X_);
            }
            if (point3Y_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(6, point3Y_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.TriangleMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.TriangleMessage other = (sun.socket.pb.WhiteBroadMessages.TriangleMessage) obj;

            boolean result = true;
            result = result && (getWidth()
                    == other.getWidth());
            result = result && getColor()
                    .equals(other.getColor());
            result = result && (getPoint2X()
                    == other.getPoint2X());
            result = result && (getPoint2Y()
                    == other.getPoint2Y());
            result = result && (getPoint3X()
                    == other.getPoint3X());
            result = result && (getPoint3Y()
                    == other.getPoint3Y());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + WIDTH_FIELD_NUMBER;
            hash = (53 * hash) + getWidth();
            hash = (37 * hash) + COLOR_FIELD_NUMBER;
            hash = (53 * hash) + getColor().hashCode();
            hash = (37 * hash) + POINT2X_FIELD_NUMBER;
            hash = (53 * hash) + getPoint2X();
            hash = (37 * hash) + POINT2Y_FIELD_NUMBER;
            hash = (53 * hash) + getPoint2Y();
            hash = (37 * hash) + POINT3X_FIELD_NUMBER;
            hash = (53 * hash) + getPoint3X();
            hash = (37 * hash) + POINT3Y_FIELD_NUMBER;
            hash = (53 * hash) + getPoint3Y();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.TriangleMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.TriangleMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.TriangleMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.TriangleMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.TriangleMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.TriangleMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.TriangleMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.TriangleMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.TriangleMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.TriangleMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.TriangleMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.TriangleMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.TriangleMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * [226.9,115.3,1.7,"triangle",[2,"#ed1941",226.9,289.0,473.6,289.1],true]
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.TriangleMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.TriangleMessage)
                sun.socket.pb.WhiteBroadMessages.TriangleMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_TriangleMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_TriangleMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.TriangleMessage.class, sun.socket.pb.WhiteBroadMessages.TriangleMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.TriangleMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                width_ = 0;

                color_ = "";

                point2X_ = 0;

                point2Y_ = 0;

                point3X_ = 0;

                point3Y_ = 0;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_TriangleMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.TriangleMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.TriangleMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.TriangleMessage build() {
                sun.socket.pb.WhiteBroadMessages.TriangleMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.TriangleMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.TriangleMessage result = new sun.socket.pb.WhiteBroadMessages.TriangleMessage(this);
                result.width_ = width_;
                result.color_ = color_;
                result.point2X_ = point2X_;
                result.point2Y_ = point2Y_;
                result.point3X_ = point3X_;
                result.point3Y_ = point3Y_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.TriangleMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.TriangleMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.TriangleMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.TriangleMessage.getDefaultInstance()) return this;
                if (other.getWidth() != 0) {
                    setWidth(other.getWidth());
                }
                if (!other.getColor().isEmpty()) {
                    color_ = other.color_;
                    onChanged();
                }
                if (other.getPoint2X() != 0) {
                    setPoint2X(other.getPoint2X());
                }
                if (other.getPoint2Y() != 0) {
                    setPoint2Y(other.getPoint2Y());
                }
                if (other.getPoint3X() != 0) {
                    setPoint3X(other.getPoint3X());
                }
                if (other.getPoint3Y() != 0) {
                    setPoint3Y(other.getPoint3Y());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.TriangleMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.TriangleMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int width_ ;
            /**
             * <code>int32 width = 1;</code>
             */
            public int getWidth() {
                return width_;
            }
            /**
             * <code>int32 width = 1;</code>
             */
            public Builder setWidth(int value) {

                width_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 width = 1;</code>
             */
            public Builder clearWidth() {

                width_ = 0;
                onChanged();
                return this;
            }

            private Object color_ = "";
            /**
             * <code>string color = 2;</code>
             */
            public String getColor() {
                Object ref = color_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    color_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string color = 2;</code>
             */
            public com.google.protobuf.ByteString
            getColorBytes() {
                Object ref = color_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    color_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder setColor(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                color_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder clearColor() {

                color_ = getDefaultInstance().getColor();
                onChanged();
                return this;
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder setColorBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                color_ = value;
                onChanged();
                return this;
            }

            private int point2X_ ;
            /**
             * <code>int32 point2x = 3;</code>
             */
            public int getPoint2X() {
                return point2X_;
            }
            /**
             * <code>int32 point2x = 3;</code>
             */
            public Builder setPoint2X(int value) {

                point2X_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 point2x = 3;</code>
             */
            public Builder clearPoint2X() {

                point2X_ = 0;
                onChanged();
                return this;
            }

            private int point2Y_ ;
            /**
             * <code>int32 point2y = 4;</code>
             */
            public int getPoint2Y() {
                return point2Y_;
            }
            /**
             * <code>int32 point2y = 4;</code>
             */
            public Builder setPoint2Y(int value) {

                point2Y_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 point2y = 4;</code>
             */
            public Builder clearPoint2Y() {

                point2Y_ = 0;
                onChanged();
                return this;
            }

            private int point3X_ ;
            /**
             * <code>int32 point3x = 5;</code>
             */
            public int getPoint3X() {
                return point3X_;
            }
            /**
             * <code>int32 point3x = 5;</code>
             */
            public Builder setPoint3X(int value) {

                point3X_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 point3x = 5;</code>
             */
            public Builder clearPoint3X() {

                point3X_ = 0;
                onChanged();
                return this;
            }

            private int point3Y_ ;
            /**
             * <code>int32 point3y = 6;</code>
             */
            public int getPoint3Y() {
                return point3Y_;
            }
            /**
             * <code>int32 point3y = 6;</code>
             */
            public Builder setPoint3Y(int value) {

                point3Y_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 point3y = 6;</code>
             */
            public Builder clearPoint3Y() {

                point3Y_ = 0;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.TriangleMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.TriangleMessage)
        private static final sun.socket.pb.WhiteBroadMessages.TriangleMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.TriangleMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.TriangleMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<TriangleMessage>
                PARSER = new com.google.protobuf.AbstractParser<TriangleMessage>() {
            public TriangleMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new TriangleMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<TriangleMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<TriangleMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.TriangleMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface StartMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.StartMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 width = 1;</code>
         */
        int getWidth();

        /**
         * <code>string color = 2;</code>
         */
        String getColor();
        /**
         * <code>string color = 2;</code>
         */
        com.google.protobuf.ByteString
        getColorBytes();

        /**
         * <code>int32 fill = 3;</code>
         */
        int getFill();
    }
    /**
     * <pre>
     * [218,283,1,"star",[2,"black",0]],[350, 306, 2],...,[350, 307, 2, true]
     * </pre>
     *
     * Protobuf type {@code sun.socket.pb.StartMessage}
     */
    public  static final class StartMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.StartMessage)
            StartMessageOrBuilder {
        // Use StartMessage.newBuilder() to construct.
        private StartMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private StartMessage() {
            width_ = 0;
            color_ = "";
            fill_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private StartMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            width_ = input.readInt32();
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            color_ = s;
                            break;
                        }
                        case 24: {

                            fill_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_StartMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_StartMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.WhiteBroadMessages.StartMessage.class, sun.socket.pb.WhiteBroadMessages.StartMessage.Builder.class);
        }

        public static final int WIDTH_FIELD_NUMBER = 1;
        private int width_;
        /**
         * <code>int32 width = 1;</code>
         */
        public int getWidth() {
            return width_;
        }

        public static final int COLOR_FIELD_NUMBER = 2;
        private volatile Object color_;
        /**
         * <code>string color = 2;</code>
         */
        public String getColor() {
            Object ref = color_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                color_ = s;
                return s;
            }
        }
        /**
         * <code>string color = 2;</code>
         */
        public com.google.protobuf.ByteString
        getColorBytes() {
            Object ref = color_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                color_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int FILL_FIELD_NUMBER = 3;
        private int fill_;
        /**
         * <code>int32 fill = 3;</code>
         */
        public int getFill() {
            return fill_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (width_ != 0) {
                output.writeInt32(1, width_);
            }
            if (!getColorBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, color_);
            }
            if (fill_ != 0) {
                output.writeInt32(3, fill_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (width_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, width_);
            }
            if (!getColorBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, color_);
            }
            if (fill_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, fill_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof sun.socket.pb.WhiteBroadMessages.StartMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.WhiteBroadMessages.StartMessage other = (sun.socket.pb.WhiteBroadMessages.StartMessage) obj;

            boolean result = true;
            result = result && (getWidth()
                    == other.getWidth());
            result = result && getColor()
                    .equals(other.getColor());
            result = result && (getFill()
                    == other.getFill());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + WIDTH_FIELD_NUMBER;
            hash = (53 * hash) + getWidth();
            hash = (37 * hash) + COLOR_FIELD_NUMBER;
            hash = (53 * hash) + getColor().hashCode();
            hash = (37 * hash) + FILL_FIELD_NUMBER;
            hash = (53 * hash) + getFill();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.WhiteBroadMessages.StartMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.StartMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.StartMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.StartMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.StartMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.WhiteBroadMessages.StartMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.StartMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.StartMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.StartMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.StartMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.WhiteBroadMessages.StartMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.WhiteBroadMessages.StartMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(sun.socket.pb.WhiteBroadMessages.StartMessage prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * [218,283,1,"star",[2,"black",0]],[350, 306, 2],...,[350, 307, 2, true]
         * </pre>
         *
         * Protobuf type {@code sun.socket.pb.StartMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.StartMessage)
                sun.socket.pb.WhiteBroadMessages.StartMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_StartMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_StartMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.WhiteBroadMessages.StartMessage.class, sun.socket.pb.WhiteBroadMessages.StartMessage.Builder.class);
            }

            // Construct using sun.socket.pb.WhiteBroadMessages.StartMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                width_ = 0;

                color_ = "";

                fill_ = 0;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.WhiteBroadMessages.internal_static_com_zhangmen_pb_StartMessage_descriptor;
            }

            public sun.socket.pb.WhiteBroadMessages.StartMessage getDefaultInstanceForType() {
                return sun.socket.pb.WhiteBroadMessages.StartMessage.getDefaultInstance();
            }

            public sun.socket.pb.WhiteBroadMessages.StartMessage build() {
                sun.socket.pb.WhiteBroadMessages.StartMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.WhiteBroadMessages.StartMessage buildPartial() {
                sun.socket.pb.WhiteBroadMessages.StartMessage result = new sun.socket.pb.WhiteBroadMessages.StartMessage(this);
                result.width_ = width_;
                result.color_ = color_;
                result.fill_ = fill_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof sun.socket.pb.WhiteBroadMessages.StartMessage) {
                    return mergeFrom((sun.socket.pb.WhiteBroadMessages.StartMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.WhiteBroadMessages.StartMessage other) {
                if (other == sun.socket.pb.WhiteBroadMessages.StartMessage.getDefaultInstance()) return this;
                if (other.getWidth() != 0) {
                    setWidth(other.getWidth());
                }
                if (!other.getColor().isEmpty()) {
                    color_ = other.color_;
                    onChanged();
                }
                if (other.getFill() != 0) {
                    setFill(other.getFill());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                sun.socket.pb.WhiteBroadMessages.StartMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.WhiteBroadMessages.StartMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int width_ ;
            /**
             * <code>int32 width = 1;</code>
             */
            public int getWidth() {
                return width_;
            }
            /**
             * <code>int32 width = 1;</code>
             */
            public Builder setWidth(int value) {

                width_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 width = 1;</code>
             */
            public Builder clearWidth() {

                width_ = 0;
                onChanged();
                return this;
            }

            private Object color_ = "";
            /**
             * <code>string color = 2;</code>
             */
            public String getColor() {
                Object ref = color_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    color_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string color = 2;</code>
             */
            public com.google.protobuf.ByteString
            getColorBytes() {
                Object ref = color_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    color_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder setColor(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                color_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder clearColor() {

                color_ = getDefaultInstance().getColor();
                onChanged();
                return this;
            }
            /**
             * <code>string color = 2;</code>
             */
            public Builder setColorBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                color_ = value;
                onChanged();
                return this;
            }

            private int fill_ ;
            /**
             * <code>int32 fill = 3;</code>
             */
            public int getFill() {
                return fill_;
            }
            /**
             * <code>int32 fill = 3;</code>
             */
            public Builder setFill(int value) {

                fill_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 fill = 3;</code>
             */
            public Builder clearFill() {

                fill_ = 0;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.StartMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.StartMessage)
        private static final sun.socket.pb.WhiteBroadMessages.StartMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.WhiteBroadMessages.StartMessage();
        }

        public static sun.socket.pb.WhiteBroadMessages.StartMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<StartMessage>
                PARSER = new com.google.protobuf.AbstractParser<StartMessage>() {
            public StartMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new StartMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<StartMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<StartMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.WhiteBroadMessages.StartMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_WhiteBroadMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_WhiteBroadMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_LoadSlideMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_LoadSlideMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_SwitchSlideMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_SwitchSlideMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_ScrollSlideMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_ScrollSlideMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_RotateSlideMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_RotateSlideMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_LoadPPTMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_LoadPPTMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_BrushMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_BrushMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_LineMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_LineMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_EllipseMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_EllipseMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_TextToolMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_TextToolMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_EraserMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_EraserMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_EraserRectangleMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_EraserRectangleMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_LineArrowMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_LineArrowMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_TriangleMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_TriangleMessage_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_StartMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_StartMessage_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        String[] descriptorData = {
                "\n\020WhiteBroad.proto\022\017sun.socket.pb\"\361\006\n\021" +
                        "WhiteBroadMessage\022\017\n\007point_x\030\001 \001(\005\022\017\n\007po" +
                        "int_y\030\002 \001(\005\022\020\n\010sequence\030\003 \001(\005\022\r\n\005event\030\004" +
                        " \001(\005\022\021\n\007default\030\005 \001(\tH\000\0226\n\tloadSlide\030\006 \001" +
                        "(\0132!.sun.socket.pb.LoadSlideMessageH\000\022" +
                        ":\n\013switchSlide\030\007 \001(\0132#.sun.socket.pb.S" +
                        "witchSlideMessageH\000\022:\n\013scrollSlide\030\010 \001(\013" +
                        "2#.sun.socket.pb.ScrollSlideMessageH\000\022" +
                        ":\n\013rotateSlide\030\t \001(\0132#.sun.socket.pb.R" +
                        "otateSlideMessageH\000\0222\n\007loadPPT\030\n \001(\0132\037.c",
                "om.zhangmen.pb.LoadPPTMessageH\000\022.\n\005brush" +
                        "\030\013 \001(\0132\035.sun.socket.pb.BrushMessageH\000\022" +
                        ",\n\004line\030\014 \001(\0132\034.sun.socket.pb.LineMess" +
                        "ageH\000\0222\n\007ellipse\030\r \001(\0132\037.sun.socket.pb" +
                        ".EllipseMessageH\000\0220\n\004text\030\016 \001(\0132 .com.zh" +
                        "angmen.pb.TextToolMessageH\000\0220\n\006eraser\030\017 " +
                        "\001(\0132\036.sun.socket.pb.EraserMessageH\000\022B\n" +
                        "\017eraserRectangle\030\020 \001(\0132\'.sun.socket.pb" +
                        ".EraserRectangleMessageH\000\0226\n\tlineArrow\030\021" +
                        " \001(\0132!.sun.socket.pb.LineArrowMessageH",
                "\000\0224\n\010triangle\030\022 \001(\0132 .sun.socket.pb.Tr" +
                        "iangleMessageH\000\022.\n\005start\030\023 \001(\0132\035.com.zha" +
                        "ngmen.pb.StartMessageH\000B\016\n\014EventMessage\"" +
                        "L\n\020LoadSlideMessage\022\016\n\006source\030\001 \001(\t\022\014\n\004p" +
                        "age\030\002 \001(\005\022\r\n\005ratio\030\003 \001(\005\022\013\n\003end\030\004 \001(\010\"/\n" +
                        "\022SwitchSlideMessage\022\014\n\004page\030\001 \001(\005\022\013\n\003end" +
                        "\030\002 \001(\010\"/\n\022ScrollSlideMessage\022\014\n\004move\030\001 \001" +
                        "(\005\022\013\n\003end\030\002 \001(\010\"3\n\022RotateSlideMessage\022\020\n" +
                        "\010rotation\030\001 \001(\005\022\013\n\003end\030\003 \001(\010\"|\n\016LoadPPTM" +
                        "essage\022\016\n\006source\030\001 \001(\t\022\014\n\004page\030\002 \001(\005\022\016\n\006",
                "ration\030\003 \001(\005\022\017\n\007pptName\030\004 \001(\t\022\r\n\005ppyId\030\005" +
                        " \001(\005\022\017\n\007pptList\030\006 \003(\005\022\013\n\003end\030\007 \001(\010\",\n\014Br" +
                        "ushMessage\022\r\n\005width\030\001 \001(\005\022\r\n\005color\030\002 \001(\t" +
                        "\":\n\013LineMessage\022\r\n\005width\030\001 \001(\005\022\r\n\005color\030" +
                        "\002 \001(\t\022\r\n\005align\030\003 \001(\005\"K\n\016EllipseMessage\022\r" +
                        "\n\005width\030\001 \001(\005\022\014\n\004fill\030\002 \001(\005\022\r\n\005color\030\003 \001" +
                        "(\t\022\r\n\005shift\030\004 \001(\005\"@\n\017TextToolMessage\022\r\n\005" +
                        "pixel\030\001 \001(\005\022\r\n\005color\030\002 \001(\t\022\017\n\007content\030\004 " +
                        "\001(\t\"#\n\rEraserMessage\022\022\n\ndeleteType\030\001 \001(\005" +
                        "\",\n\026EraserRectangleMessage\022\022\n\ndeleteType",
                "\030\001 \001(\005\"P\n\020LineArrowMessage\022\r\n\005width\030\001 \001(" +
                        "\005\022\r\n\005color\030\002 \001(\t\022\016\n\006startX\030\003 \001(\005\022\016\n\006star" +
                        "tY\030\004 \001(\005\"s\n\017TriangleMessage\022\r\n\005width\030\001 \001" +
                        "(\005\022\r\n\005color\030\002 \001(\t\022\017\n\007point2x\030\003 \001(\005\022\017\n\007po" +
                        "int2y\030\004 \001(\005\022\017\n\007point3x\030\005 \001(\005\022\017\n\007point3y\030" +
                        "\006 \001(\005\":\n\014StartMessage\022\r\n\005width\030\001 \001(\005\022\r\n\005" +
                        "color\030\002 \001(\t\022\014\n\004fill\030\003 \001(\005B\'\n\017com.zhangme" +
                        "n.pbB\022WhiteBroadMessagesH\001b\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        }, assigner);
        internal_static_com_zhangmen_pb_WhiteBroadMessage_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_com_zhangmen_pb_WhiteBroadMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_WhiteBroadMessage_descriptor,
                new String[] { "PointX", "PointY", "Sequence", "Event", "Default", "LoadSlide", "SwitchSlide", "ScrollSlide", "RotateSlide", "LoadPPT", "Brush", "Line", "Ellipse", "Text", "Eraser", "EraserRectangle", "LineArrow", "Triangle", "Start", "EventMessage", });
        internal_static_com_zhangmen_pb_LoadSlideMessage_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_com_zhangmen_pb_LoadSlideMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_LoadSlideMessage_descriptor,
                new String[] { "Source", "Page", "Ratio", "End", });
        internal_static_com_zhangmen_pb_SwitchSlideMessage_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_com_zhangmen_pb_SwitchSlideMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_SwitchSlideMessage_descriptor,
                new String[] { "Page", "End", });
        internal_static_com_zhangmen_pb_ScrollSlideMessage_descriptor =
                getDescriptor().getMessageTypes().get(3);
        internal_static_com_zhangmen_pb_ScrollSlideMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_ScrollSlideMessage_descriptor,
                new String[] { "Move", "End", });
        internal_static_com_zhangmen_pb_RotateSlideMessage_descriptor =
                getDescriptor().getMessageTypes().get(4);
        internal_static_com_zhangmen_pb_RotateSlideMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_RotateSlideMessage_descriptor,
                new String[] { "Rotation", "End", });
        internal_static_com_zhangmen_pb_LoadPPTMessage_descriptor =
                getDescriptor().getMessageTypes().get(5);
        internal_static_com_zhangmen_pb_LoadPPTMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_LoadPPTMessage_descriptor,
                new String[] { "Source", "Page", "Ration", "PptName", "PpyId", "PptList", "End", });
        internal_static_com_zhangmen_pb_BrushMessage_descriptor =
                getDescriptor().getMessageTypes().get(6);
        internal_static_com_zhangmen_pb_BrushMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_BrushMessage_descriptor,
                new String[] { "Width", "Color", });
        internal_static_com_zhangmen_pb_LineMessage_descriptor =
                getDescriptor().getMessageTypes().get(7);
        internal_static_com_zhangmen_pb_LineMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_LineMessage_descriptor,
                new String[] { "Width", "Color", "Align", });
        internal_static_com_zhangmen_pb_EllipseMessage_descriptor =
                getDescriptor().getMessageTypes().get(8);
        internal_static_com_zhangmen_pb_EllipseMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_EllipseMessage_descriptor,
                new String[] { "Width", "Fill", "Color", "Shift", });
        internal_static_com_zhangmen_pb_TextToolMessage_descriptor =
                getDescriptor().getMessageTypes().get(9);
        internal_static_com_zhangmen_pb_TextToolMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_TextToolMessage_descriptor,
                new String[] { "Pixel", "Color", "Content", });
        internal_static_com_zhangmen_pb_EraserMessage_descriptor =
                getDescriptor().getMessageTypes().get(10);
        internal_static_com_zhangmen_pb_EraserMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_EraserMessage_descriptor,
                new String[] { "DeleteType", });
        internal_static_com_zhangmen_pb_EraserRectangleMessage_descriptor =
                getDescriptor().getMessageTypes().get(11);
        internal_static_com_zhangmen_pb_EraserRectangleMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_EraserRectangleMessage_descriptor,
                new String[] { "DeleteType", });
        internal_static_com_zhangmen_pb_LineArrowMessage_descriptor =
                getDescriptor().getMessageTypes().get(12);
        internal_static_com_zhangmen_pb_LineArrowMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_LineArrowMessage_descriptor,
                new String[] { "Width", "Color", "StartX", "StartY", });
        internal_static_com_zhangmen_pb_TriangleMessage_descriptor =
                getDescriptor().getMessageTypes().get(13);
        internal_static_com_zhangmen_pb_TriangleMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_TriangleMessage_descriptor,
                new String[] { "Width", "Color", "Point2X", "Point2Y", "Point3X", "Point3Y", });
        internal_static_com_zhangmen_pb_StartMessage_descriptor =
                getDescriptor().getMessageTypes().get(14);
        internal_static_com_zhangmen_pb_StartMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_StartMessage_descriptor,
                new String[] { "Width", "Color", "Fill", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
