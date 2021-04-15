package sun.socket.pb;

public final class ChatProto {
    private ChatProto() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    public interface ChatMessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:sun.socket.pb.ChatMessage)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string nickName = 1;</code>
         */
        String getNickName();
        /**
         * <code>string nickName = 1;</code>
         */
        com.google.protobuf.ByteString
        getNickNameBytes();

        /**
         * <code>string mobile = 2;</code>
         */
        String getMobile();
        /**
         * <code>string mobile = 2;</code>
         */
        com.google.protobuf.ByteString
        getMobileBytes();

        /**
         * <code>string role = 3;</code>
         */
        String getRole();
        /**
         * <code>string role = 3;</code>
         */
        com.google.protobuf.ByteString
        getRoleBytes();

        /**
         * <code>string text = 4;</code>
         */
        String getText();
        /**
         * <code>string text = 4;</code>
         */
        com.google.protobuf.ByteString
        getTextBytes();

        /**
         * <code>int64 timestamp = 5;</code>
         */
        long getTimestamp();

        /**
         * <code>string roleName = 6;</code>
         */
        String getRoleName();
        /**
         * <code>string roleName = 6;</code>
         */
        com.google.protobuf.ByteString
        getRoleNameBytes();

        /**
         * <code>string toMobile = 7;</code>
         */
        String getToMobile();
        /**
         * <code>string toMobile = 7;</code>
         */
        com.google.protobuf.ByteString
        getToMobileBytes();

        /**
         * <code>string toRoleName = 8;</code>
         */
        String getToRoleName();
        /**
         * <code>string toRoleName = 8;</code>
         */
        com.google.protobuf.ByteString
        getToRoleNameBytes();
    }
    /**
     * Protobuf type {@code sun.socket.pb.ChatMessage}
     */
    public  static final class ChatMessage extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:sun.socket.pb.ChatMessage)
            ChatMessageOrBuilder {
        // Use ChatMessage.newBuilder() to construct.
        private ChatMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private ChatMessage() {
            nickName_ = "";
            mobile_ = "";
            role_ = "";
            text_ = "";
            timestamp_ = 0L;
            roleName_ = "";
            toMobile_ = "";
            toRoleName_ = "";
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private ChatMessage(
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

                            nickName_ = s;
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            mobile_ = s;
                            break;
                        }
                        case 26: {
                            String s = input.readStringRequireUtf8();

                            role_ = s;
                            break;
                        }
                        case 34: {
                            String s = input.readStringRequireUtf8();

                            text_ = s;
                            break;
                        }
                        case 40: {

                            timestamp_ = input.readInt64();
                            break;
                        }
                        case 50: {
                            String s = input.readStringRequireUtf8();

                            roleName_ = s;
                            break;
                        }
                        case 58: {
                            String s = input.readStringRequireUtf8();

                            toMobile_ = s;
                            break;
                        }
                        case 66: {
                            String s = input.readStringRequireUtf8();

                            toRoleName_ = s;
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
            return sun.socket.pb.ChatProto.internal_static_com_zhangmen_pb_ChatMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return sun.socket.pb.ChatProto.internal_static_com_zhangmen_pb_ChatMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            sun.socket.pb.ChatProto.ChatMessage.class, sun.socket.pb.ChatProto.ChatMessage.Builder.class);
        }

        public static final int NICKNAME_FIELD_NUMBER = 1;
        private volatile Object nickName_;
        /**
         * <code>string nickName = 1;</code>
         */
        public String getNickName() {
            Object ref = nickName_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                nickName_ = s;
                return s;
            }
        }
        /**
         * <code>string nickName = 1;</code>
         */
        public com.google.protobuf.ByteString
        getNickNameBytes() {
            Object ref = nickName_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                nickName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int MOBILE_FIELD_NUMBER = 2;
        private volatile Object mobile_;
        /**
         * <code>string mobile = 2;</code>
         */
        public String getMobile() {
            Object ref = mobile_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                mobile_ = s;
                return s;
            }
        }
        /**
         * <code>string mobile = 2;</code>
         */
        public com.google.protobuf.ByteString
        getMobileBytes() {
            Object ref = mobile_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                mobile_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int ROLE_FIELD_NUMBER = 3;
        private volatile Object role_;
        /**
         * <code>string role = 3;</code>
         */
        public String getRole() {
            Object ref = role_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                role_ = s;
                return s;
            }
        }
        /**
         * <code>string role = 3;</code>
         */
        public com.google.protobuf.ByteString
        getRoleBytes() {
            Object ref = role_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                role_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int TEXT_FIELD_NUMBER = 4;
        private volatile Object text_;
        /**
         * <code>string text = 4;</code>
         */
        public String getText() {
            Object ref = text_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                text_ = s;
                return s;
            }
        }
        /**
         * <code>string text = 4;</code>
         */
        public com.google.protobuf.ByteString
        getTextBytes() {
            Object ref = text_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                text_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int TIMESTAMP_FIELD_NUMBER = 5;
        private long timestamp_;
        /**
         * <code>int64 timestamp = 5;</code>
         */
        public long getTimestamp() {
            return timestamp_;
        }

        public static final int ROLENAME_FIELD_NUMBER = 6;
        private volatile Object roleName_;
        /**
         * <code>string roleName = 6;</code>
         */
        public String getRoleName() {
            Object ref = roleName_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                roleName_ = s;
                return s;
            }
        }
        /**
         * <code>string roleName = 6;</code>
         */
        public com.google.protobuf.ByteString
        getRoleNameBytes() {
            Object ref = roleName_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                roleName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int TOMOBILE_FIELD_NUMBER = 7;
        private volatile Object toMobile_;
        /**
         * <code>string toMobile = 7;</code>
         */
        public String getToMobile() {
            Object ref = toMobile_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                toMobile_ = s;
                return s;
            }
        }
        /**
         * <code>string toMobile = 7;</code>
         */
        public com.google.protobuf.ByteString
        getToMobileBytes() {
            Object ref = toMobile_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                toMobile_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int TOROLENAME_FIELD_NUMBER = 8;
        private volatile Object toRoleName_;
        /**
         * <code>string toRoleName = 8;</code>
         */
        public String getToRoleName() {
            Object ref = toRoleName_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                toRoleName_ = s;
                return s;
            }
        }
        /**
         * <code>string toRoleName = 8;</code>
         */
        public com.google.protobuf.ByteString
        getToRoleNameBytes() {
            Object ref = toRoleName_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                toRoleName_ = b;
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
            if (!getNickNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nickName_);
            }
            if (!getMobileBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mobile_);
            }
            if (!getRoleBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, role_);
            }
            if (!getTextBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, text_);
            }
            if (timestamp_ != 0L) {
                output.writeInt64(5, timestamp_);
            }
            if (!getRoleNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 6, roleName_);
            }
            if (!getToMobileBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 7, toMobile_);
            }
            if (!getToRoleNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 8, toRoleName_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getNickNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nickName_);
            }
            if (!getMobileBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mobile_);
            }
            if (!getRoleBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, role_);
            }
            if (!getTextBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, text_);
            }
            if (timestamp_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(5, timestamp_);
            }
            if (!getRoleNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, roleName_);
            }
            if (!getToMobileBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, toMobile_);
            }
            if (!getToRoleNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, toRoleName_);
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
            if (!(obj instanceof sun.socket.pb.ChatProto.ChatMessage)) {
                return super.equals(obj);
            }
            sun.socket.pb.ChatProto.ChatMessage other = (sun.socket.pb.ChatProto.ChatMessage) obj;

            boolean result = true;
            result = result && getNickName()
                    .equals(other.getNickName());
            result = result && getMobile()
                    .equals(other.getMobile());
            result = result && getRole()
                    .equals(other.getRole());
            result = result && getText()
                    .equals(other.getText());
            result = result && (getTimestamp()
                    == other.getTimestamp());
            result = result && getRoleName()
                    .equals(other.getRoleName());
            result = result && getToMobile()
                    .equals(other.getToMobile());
            result = result && getToRoleName()
                    .equals(other.getToRoleName());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
            hash = (53 * hash) + getNickName().hashCode();
            hash = (37 * hash) + MOBILE_FIELD_NUMBER;
            hash = (53 * hash) + getMobile().hashCode();
            hash = (37 * hash) + ROLE_FIELD_NUMBER;
            hash = (53 * hash) + getRole().hashCode();
            hash = (37 * hash) + TEXT_FIELD_NUMBER;
            hash = (53 * hash) + getText().hashCode();
            hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getTimestamp());
            hash = (37 * hash) + ROLENAME_FIELD_NUMBER;
            hash = (53 * hash) + getRoleName().hashCode();
            hash = (37 * hash) + TOMOBILE_FIELD_NUMBER;
            hash = (53 * hash) + getToMobile().hashCode();
            hash = (37 * hash) + TOROLENAME_FIELD_NUMBER;
            hash = (53 * hash) + getToRoleName().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static sun.socket.pb.ChatProto.ChatMessage parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.ChatProto.ChatMessage parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.ChatProto.ChatMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.ChatProto.ChatMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.ChatProto.ChatMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static sun.socket.pb.ChatProto.ChatMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static sun.socket.pb.ChatProto.ChatMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.ChatProto.ChatMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.ChatProto.ChatMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static sun.socket.pb.ChatProto.ChatMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static sun.socket.pb.ChatProto.ChatMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static sun.socket.pb.ChatProto.ChatMessage parseFrom(
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
        public static Builder newBuilder(sun.socket.pb.ChatProto.ChatMessage prototype) {
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
         * Protobuf type {@code sun.socket.pb.ChatMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:sun.socket.pb.ChatMessage)
                sun.socket.pb.ChatProto.ChatMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return sun.socket.pb.ChatProto.internal_static_com_zhangmen_pb_ChatMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return sun.socket.pb.ChatProto.internal_static_com_zhangmen_pb_ChatMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                sun.socket.pb.ChatProto.ChatMessage.class, sun.socket.pb.ChatProto.ChatMessage.Builder.class);
            }

            // Construct using sun.socket.pb.ChatProto.ChatMessage.newBuilder()
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
                nickName_ = "";

                mobile_ = "";

                role_ = "";

                text_ = "";

                timestamp_ = 0L;

                roleName_ = "";

                toMobile_ = "";

                toRoleName_ = "";

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return sun.socket.pb.ChatProto.internal_static_com_zhangmen_pb_ChatMessage_descriptor;
            }

            public sun.socket.pb.ChatProto.ChatMessage getDefaultInstanceForType() {
                return sun.socket.pb.ChatProto.ChatMessage.getDefaultInstance();
            }

            public sun.socket.pb.ChatProto.ChatMessage build() {
                sun.socket.pb.ChatProto.ChatMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public sun.socket.pb.ChatProto.ChatMessage buildPartial() {
                sun.socket.pb.ChatProto.ChatMessage result = new sun.socket.pb.ChatProto.ChatMessage(this);
                result.nickName_ = nickName_;
                result.mobile_ = mobile_;
                result.role_ = role_;
                result.text_ = text_;
                result.timestamp_ = timestamp_;
                result.roleName_ = roleName_;
                result.toMobile_ = toMobile_;
                result.toRoleName_ = toRoleName_;
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
                if (other instanceof sun.socket.pb.ChatProto.ChatMessage) {
                    return mergeFrom((sun.socket.pb.ChatProto.ChatMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(sun.socket.pb.ChatProto.ChatMessage other) {
                if (other == sun.socket.pb.ChatProto.ChatMessage.getDefaultInstance()) return this;
                if (!other.getNickName().isEmpty()) {
                    nickName_ = other.nickName_;
                    onChanged();
                }
                if (!other.getMobile().isEmpty()) {
                    mobile_ = other.mobile_;
                    onChanged();
                }
                if (!other.getRole().isEmpty()) {
                    role_ = other.role_;
                    onChanged();
                }
                if (!other.getText().isEmpty()) {
                    text_ = other.text_;
                    onChanged();
                }
                if (other.getTimestamp() != 0L) {
                    setTimestamp(other.getTimestamp());
                }
                if (!other.getRoleName().isEmpty()) {
                    roleName_ = other.roleName_;
                    onChanged();
                }
                if (!other.getToMobile().isEmpty()) {
                    toMobile_ = other.toMobile_;
                    onChanged();
                }
                if (!other.getToRoleName().isEmpty()) {
                    toRoleName_ = other.toRoleName_;
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
                sun.socket.pb.ChatProto.ChatMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (sun.socket.pb.ChatProto.ChatMessage) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private Object nickName_ = "";
            /**
             * <code>string nickName = 1;</code>
             */
            public String getNickName() {
                Object ref = nickName_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    nickName_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string nickName = 1;</code>
             */
            public com.google.protobuf.ByteString
            getNickNameBytes() {
                Object ref = nickName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    nickName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string nickName = 1;</code>
             */
            public Builder setNickName(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                nickName_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string nickName = 1;</code>
             */
            public Builder clearNickName() {

                nickName_ = getDefaultInstance().getNickName();
                onChanged();
                return this;
            }
            /**
             * <code>string nickName = 1;</code>
             */
            public Builder setNickNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                nickName_ = value;
                onChanged();
                return this;
            }

            private Object mobile_ = "";
            /**
             * <code>string mobile = 2;</code>
             */
            public String getMobile() {
                Object ref = mobile_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    mobile_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string mobile = 2;</code>
             */
            public com.google.protobuf.ByteString
            getMobileBytes() {
                Object ref = mobile_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    mobile_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string mobile = 2;</code>
             */
            public Builder setMobile(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                mobile_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string mobile = 2;</code>
             */
            public Builder clearMobile() {

                mobile_ = getDefaultInstance().getMobile();
                onChanged();
                return this;
            }
            /**
             * <code>string mobile = 2;</code>
             */
            public Builder setMobileBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                mobile_ = value;
                onChanged();
                return this;
            }

            private Object role_ = "";
            /**
             * <code>string role = 3;</code>
             */
            public String getRole() {
                Object ref = role_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    role_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string role = 3;</code>
             */
            public com.google.protobuf.ByteString
            getRoleBytes() {
                Object ref = role_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    role_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string role = 3;</code>
             */
            public Builder setRole(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                role_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string role = 3;</code>
             */
            public Builder clearRole() {

                role_ = getDefaultInstance().getRole();
                onChanged();
                return this;
            }
            /**
             * <code>string role = 3;</code>
             */
            public Builder setRoleBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                role_ = value;
                onChanged();
                return this;
            }

            private Object text_ = "";
            /**
             * <code>string text = 4;</code>
             */
            public String getText() {
                Object ref = text_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    text_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string text = 4;</code>
             */
            public com.google.protobuf.ByteString
            getTextBytes() {
                Object ref = text_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    text_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string text = 4;</code>
             */
            public Builder setText(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                text_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string text = 4;</code>
             */
            public Builder clearText() {

                text_ = getDefaultInstance().getText();
                onChanged();
                return this;
            }
            /**
             * <code>string text = 4;</code>
             */
            public Builder setTextBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                text_ = value;
                onChanged();
                return this;
            }

            private long timestamp_ ;
            /**
             * <code>int64 timestamp = 5;</code>
             */
            public long getTimestamp() {
                return timestamp_;
            }
            /**
             * <code>int64 timestamp = 5;</code>
             */
            public Builder setTimestamp(long value) {

                timestamp_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int64 timestamp = 5;</code>
             */
            public Builder clearTimestamp() {

                timestamp_ = 0L;
                onChanged();
                return this;
            }

            private Object roleName_ = "";
            /**
             * <code>string roleName = 6;</code>
             */
            public String getRoleName() {
                Object ref = roleName_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    roleName_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string roleName = 6;</code>
             */
            public com.google.protobuf.ByteString
            getRoleNameBytes() {
                Object ref = roleName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    roleName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string roleName = 6;</code>
             */
            public Builder setRoleName(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                roleName_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string roleName = 6;</code>
             */
            public Builder clearRoleName() {

                roleName_ = getDefaultInstance().getRoleName();
                onChanged();
                return this;
            }
            /**
             * <code>string roleName = 6;</code>
             */
            public Builder setRoleNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                roleName_ = value;
                onChanged();
                return this;
            }

            private Object toMobile_ = "";
            /**
             * <code>string toMobile = 7;</code>
             */
            public String getToMobile() {
                Object ref = toMobile_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    toMobile_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string toMobile = 7;</code>
             */
            public com.google.protobuf.ByteString
            getToMobileBytes() {
                Object ref = toMobile_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    toMobile_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string toMobile = 7;</code>
             */
            public Builder setToMobile(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                toMobile_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string toMobile = 7;</code>
             */
            public Builder clearToMobile() {

                toMobile_ = getDefaultInstance().getToMobile();
                onChanged();
                return this;
            }
            /**
             * <code>string toMobile = 7;</code>
             */
            public Builder setToMobileBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                toMobile_ = value;
                onChanged();
                return this;
            }

            private Object toRoleName_ = "";
            /**
             * <code>string toRoleName = 8;</code>
             */
            public String getToRoleName() {
                Object ref = toRoleName_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    toRoleName_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>string toRoleName = 8;</code>
             */
            public com.google.protobuf.ByteString
            getToRoleNameBytes() {
                Object ref = toRoleName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    toRoleName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string toRoleName = 8;</code>
             */
            public Builder setToRoleName(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                toRoleName_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string toRoleName = 8;</code>
             */
            public Builder clearToRoleName() {

                toRoleName_ = getDefaultInstance().getToRoleName();
                onChanged();
                return this;
            }
            /**
             * <code>string toRoleName = 8;</code>
             */
            public Builder setToRoleNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                toRoleName_ = value;
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


            // @@protoc_insertion_point(builder_scope:sun.socket.pb.ChatMessage)
        }

        // @@protoc_insertion_point(class_scope:sun.socket.pb.ChatMessage)
        private static final sun.socket.pb.ChatProto.ChatMessage DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new sun.socket.pb.ChatProto.ChatMessage();
        }

        public static sun.socket.pb.ChatProto.ChatMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ChatMessage>
                PARSER = new com.google.protobuf.AbstractParser<ChatMessage>() {
            public ChatMessage parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new ChatMessage(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<ChatMessage> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<ChatMessage> getParserForType() {
            return PARSER;
        }

        public sun.socket.pb.ChatProto.ChatMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_zhangmen_pb_ChatMessage_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_zhangmen_pb_ChatMessage_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        String[] descriptorData = {
                "\n\017ChatProto.proto\022\017sun.socket.pb\"\226\001\n\013C" +
                        "hatMessage\022\020\n\010nickName\030\001 \001(\t\022\016\n\006mobile\030\002" +
                        " \001(\t\022\014\n\004role\030\003 \001(\t\022\014\n\004text\030\004 \001(\t\022\021\n\ttime" +
                        "stamp\030\005 \001(\003\022\020\n\010roleName\030\006 \001(\t\022\020\n\010toMobil" +
                        "e\030\007 \001(\t\022\022\n\ntoRoleName\030\010 \001(\tB\036\n\017com.zhang" +
                        "men.pbB\tChatProtoH\001b\006proto3"
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
        internal_static_com_zhangmen_pb_ChatMessage_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_com_zhangmen_pb_ChatMessage_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_zhangmen_pb_ChatMessage_descriptor,
                new String[] { "NickName", "Mobile", "Role", "Text", "Timestamp", "RoleName", "ToMobile", "ToRoleName", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
