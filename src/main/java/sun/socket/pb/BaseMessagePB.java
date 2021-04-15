package sun.socket.pb;

public final class BaseMessagePB {
    private BaseMessagePB() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    public interface BaseMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.BaseMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         *消息id
         * </pre>
         *
         * <code>int32 msgId = 1;</code>
         */
        int getMsgId();

        /**
         * <pre>
         *数据
         * </pre>
         *
         * <code>bytes data = 2;</code>
         */
        com.google.protobuf.ByteString getData();

        /**
         * <pre>
         *数据版本
         * </pre>
         *
         * <code>int32 verNo = 3;</code>
         */
        int getVerNo();
    }
    /**
     * Protobuf type {@code sun.socket.pb.BaseMessage}
     */
    public  static final class BaseMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.BaseMessage)
            BaseMessageOrBuilder {
        // Use BaseMessage.newBuilder() to construct.
        private BaseMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private BaseMessage() {
            msgId_ = 0;
            data_ = com.google.protobuf.ByteString.EMPTY;
            verNo_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private BaseMessage(
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

                            msgId_ = input.readInt32();
                            break;
                        }
                        case 18: {

                            data_ = input.readBytes();
                            break;
                        }
                        case 24: {

                            verNo_ = input.readInt32();
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
            return sun.socket.pb.BaseMessagePB.internal_static_com_zhangmen_pb_BaseMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.BaseMessagePB.internal_static_com_zhangmen_pb_BaseMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.BaseMessagePB.BaseMessage.class, sun.socket.pb.BaseMessagePB.BaseMessage.Builder.class);
        }

        public static final int MSGID_FIELD_NUMBER = 1;
        private int msgId_;
        /**
         * <pre>
         *消息id
         * </pre>
         *
         * <code>int32 msgId = 1;</code>
         */
        public int getMsgId() {
            return msgId_;
        }

        public static final int DATA_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString data_;
        /**
         * <pre>
         *数据
         * </pre>
         *
         * <code>bytes data = 2;</code>
         */
        public com.google.protobuf.ByteString getData() {
            return data_;
        }

        public static final int VERNO_FIELD_NUMBER = 3;
        private int verNo_;
        /**
         * <pre>
         *数据版本
         * </pre>
         *
         * <code>int32 verNo = 3;</code>
         */
        public int getVerNo() {
            return verNo_;
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
            if (msgId_ != 0) {
                output.writeInt32(1, msgId_);
            }
            if (!data_.isEmpty()) {
                output.writeBytes(2, data_);
            }
            if (verNo_ != 0) {
                output.writeInt32(3, verNo_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (msgId_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, msgId_);
            }
            if (!data_.isEmpty()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, data_);
            }
            if (verNo_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, verNo_);
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
            if (!(obj instanceof sun.socket.pb.BaseMessagePB.BaseMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.BaseMessagePB.BaseMessage other = (sun.socket.pb.BaseMessagePB.BaseMessage) obj;

            boolean result = true;
            result = result && (getMsgId()
                    == other.getMsgId());
            result = result && getData()
                    .equals(other.getData());
            result = result && (getVerNo()
                    == other.getVerNo());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + MSGID_FIELD_NUMBER;
            hash = (53 * hash) + getMsgId();
            hash = (37 * hash) + DATA_FIELD_NUMBER;
            hash = (53 * hash) + getData().hashCode();
            hash = (37 * hash) + VERNO_FIELD_NUMBER;
            hash = (53 * hash) + getVerNo();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.BaseMessagePB.BaseMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.BaseMessagePB.BaseMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.BaseMessagePB.BaseMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.BaseMessagePB.BaseMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.BaseMessagePB.BaseMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.BaseMessagePB.BaseMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.BaseMessagePB.BaseMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.BaseMessagePB.BaseMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.BaseMessagePB.BaseMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.BaseMessagePB.BaseMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.BaseMessagePB.BaseMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.BaseMessagePB.BaseMessage parseFrom(
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
        public static Builder newBuilder(sun.socket.pb.BaseMessagePB.BaseMessage prototype) {
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
         * Protobuf type {@code sun.socket.pb.BaseMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.BaseMessage)
                sun.socket.pb.BaseMessagePB.BaseMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.BaseMessagePB.internal_static_com_zhangmen_pb_BaseMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.BaseMessagePB.internal_static_com_zhangmen_pb_BaseMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.BaseMessagePB.BaseMessage.class, sun.socket.pb.BaseMessagePB.BaseMessage.Builder.class);
            }

            // Construct using sun.socket.pb.BaseMessagePB.BaseMessage.newBuilder()
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
                msgId_ = 0;

                data_ = com.google.protobuf.ByteString.EMPTY;

                verNo_ = 0;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.BaseMessagePB.internal_static_com_zhangmen_pb_BaseMessage_descriptor;
            }

            public sun.socket.pb.BaseMessagePB.BaseMessage getDefaultInstanceForType() {
                return sun.socket.pb.BaseMessagePB.BaseMessage.getDefaultInstance();
            }

            public sun.socket.pb.BaseMessagePB.BaseMessage build() {
                sun.socket.pb.BaseMessagePB.BaseMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.BaseMessagePB.BaseMessage buildPartial() {
                sun.socket.pb.BaseMessagePB.BaseMessage result = new sun.socket.pb.BaseMessagePB.BaseMessage(this);
                result.msgId_ = msgId_;
                result.data_ = data_;
                result.verNo_ = verNo_;
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
                if (other instanceof sun.socket.pb.BaseMessagePB.BaseMessage) {
                    return mergeFrom((sun.socket.pb.BaseMessagePB.BaseMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.BaseMessagePB.BaseMessage other) {
                if (other == sun.socket.pb.BaseMessagePB.BaseMessage.getDefaultInstance()) return this;
                if (other.getMsgId() != 0) {
                    setMsgId(other.getMsgId());
                }
                if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
                    setData(other.getData());
                }
                if (other.getVerNo() != 0) {
                    setVerNo(other.getVerNo());
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
                sun.socket.pb.BaseMessagePB.BaseMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.BaseMessagePB.BaseMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int msgId_ ;
            /**
             * <pre>
             *消息id
             * </pre>
             *
             * <code>int32 msgId = 1;</code>
             */
            public int getMsgId() {
                return msgId_;
            }
            /**
             * <pre>
             *消息id
             * </pre>
             *
             * <code>int32 msgId = 1;</code>
             */
            public Builder setMsgId(int value) {

                msgId_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *消息id
             * </pre>
             *
             * <code>int32 msgId = 1;</code>
             */
            public Builder clearMsgId() {

                msgId_ = 0;
                onChanged();
                return this;
            }

            private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <pre>
             *数据
             * </pre>
             *
             * <code>bytes data = 2;</code>
             */
            public com.google.protobuf.ByteString getData() {
                return data_;
            }
            /**
             * <pre>
             *数据
             * </pre>
             *
             * <code>bytes data = 2;</code>
             */
            public Builder setData(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                data_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *数据
             * </pre>
             *
             * <code>bytes data = 2;</code>
             */
            public Builder clearData() {

                data_ = getDefaultInstance().getData();
                onChanged();
                return this;
            }

            private int verNo_ ;
            /**
             * <pre>
             *数据版本
             * </pre>
             *
             * <code>int32 verNo = 3;</code>
             */
            public int getVerNo() {
                return verNo_;
            }
            /**
             * <pre>
             *数据版本
             * </pre>
             *
             * <code>int32 verNo = 3;</code>
             */
            public Builder setVerNo(int value) {

                verNo_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *数据版本
             * </pre>
             *
             * <code>int32 verNo = 3;</code>
             */
            public Builder clearVerNo() {

                verNo_ = 0;
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


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.BaseMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.BaseMessage)
        private static final sun.socket.pb.BaseMessagePB.BaseMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.BaseMessagePB.BaseMessage();
        }

        public static sun.socket.pb.BaseMessagePB.BaseMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<BaseMessage>
                PARSER = new com.google.protobuf.AbstractParser<BaseMessage>() {
            public BaseMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new BaseMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<BaseMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<BaseMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.BaseMessagePB.BaseMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_BaseMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_BaseMessage_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        String[] descriptorData = {
                "\n\023ZmBaseMessage.proto\022\017sun.socket.pb\"9" +
                        "\n\013BaseMessage\022\r\n\005msgId\030\001 \001(\005\022\014\n\004data\030\002 \001" +
                        "(\014\022\r\n\005verNo\030\003 \001(\005B\017B\rBaseMessagePBb\006prot" +
                        "o3"
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
        internal_static_com_zhangmen_pb_BaseMessage_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_com_zhangmen_pb_BaseMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_BaseMessage_descriptor,
                new String[] { "MsgId", "Data", "VerNo", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
