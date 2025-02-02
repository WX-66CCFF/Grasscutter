// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetReunionPrivilegeInfoRsp.proto

package emu.grasscutter.net.proto;

public final class GetReunionPrivilegeInfoRspOuterClass {
  private GetReunionPrivilegeInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetReunionPrivilegeInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetReunionPrivilegeInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
     * @return Whether the privilegeInfo field is set.
     */
    boolean hasPrivilegeInfo();
    /**
     * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
     * @return The privilegeInfo.
     */
    emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo getPrivilegeInfo();
    /**
     * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
     */
    emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfoOrBuilder getPrivilegeInfoOrBuilder();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 5060
   * Obf: AMEMLFFLOHC
   * </pre>
   *
   * Protobuf type {@code GetReunionPrivilegeInfoRsp}
   */
  public static final class GetReunionPrivilegeInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetReunionPrivilegeInfoRsp)
      GetReunionPrivilegeInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetReunionPrivilegeInfoRsp.newBuilder() to construct.
    private GetReunionPrivilegeInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetReunionPrivilegeInfoRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetReunionPrivilegeInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetReunionPrivilegeInfoRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 16: {

              retcode_ = input.readInt32();
              break;
            }
            case 42: {
              emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.Builder subBuilder = null;
              if (privilegeInfo_ != null) {
                subBuilder = privilegeInfo_.toBuilder();
              }
              privilegeInfo_ = input.readMessage(emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(privilegeInfo_);
                privilegeInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.internal_static_GetReunionPrivilegeInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.internal_static_GetReunionPrivilegeInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp.class, emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp.Builder.class);
    }

    public static final int PRIVILEGE_INFO_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo privilegeInfo_;
    /**
     * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
     * @return Whether the privilegeInfo field is set.
     */
    @java.lang.Override
    public boolean hasPrivilegeInfo() {
      return privilegeInfo_ != null;
    }
    /**
     * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
     * @return The privilegeInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo getPrivilegeInfo() {
      return privilegeInfo_ == null ? emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.getDefaultInstance() : privilegeInfo_;
    }
    /**
     * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfoOrBuilder getPrivilegeInfoOrBuilder() {
      return getPrivilegeInfo();
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (privilegeInfo_ != null) {
        output.writeMessage(5, getPrivilegeInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (privilegeInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getPrivilegeInfo());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp other = (emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp) obj;

      if (hasPrivilegeInfo() != other.hasPrivilegeInfo()) return false;
      if (hasPrivilegeInfo()) {
        if (!getPrivilegeInfo()
            .equals(other.getPrivilegeInfo())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasPrivilegeInfo()) {
        hash = (37 * hash) + PRIVILEGE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getPrivilegeInfo().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 5060
     * Obf: AMEMLFFLOHC
     * </pre>
     *
     * Protobuf type {@code GetReunionPrivilegeInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetReunionPrivilegeInfoRsp)
        emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.internal_static_GetReunionPrivilegeInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.internal_static_GetReunionPrivilegeInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp.class, emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (privilegeInfoBuilder_ == null) {
          privilegeInfo_ = null;
        } else {
          privilegeInfo_ = null;
          privilegeInfoBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.internal_static_GetReunionPrivilegeInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp build() {
        emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp buildPartial() {
        emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp result = new emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp(this);
        if (privilegeInfoBuilder_ == null) {
          result.privilegeInfo_ = privilegeInfo_;
        } else {
          result.privilegeInfo_ = privilegeInfoBuilder_.build();
        }
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp other) {
        if (other == emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp.getDefaultInstance()) return this;
        if (other.hasPrivilegeInfo()) {
          mergePrivilegeInfo(other.getPrivilegeInfo());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo privilegeInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo, emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.Builder, emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfoOrBuilder> privilegeInfoBuilder_;
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
       * @return Whether the privilegeInfo field is set.
       */
      public boolean hasPrivilegeInfo() {
        return privilegeInfoBuilder_ != null || privilegeInfo_ != null;
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
       * @return The privilegeInfo.
       */
      public emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo getPrivilegeInfo() {
        if (privilegeInfoBuilder_ == null) {
          return privilegeInfo_ == null ? emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.getDefaultInstance() : privilegeInfo_;
        } else {
          return privilegeInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
       */
      public Builder setPrivilegeInfo(emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo value) {
        if (privilegeInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          privilegeInfo_ = value;
          onChanged();
        } else {
          privilegeInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
       */
      public Builder setPrivilegeInfo(
          emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.Builder builderForValue) {
        if (privilegeInfoBuilder_ == null) {
          privilegeInfo_ = builderForValue.build();
          onChanged();
        } else {
          privilegeInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
       */
      public Builder mergePrivilegeInfo(emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo value) {
        if (privilegeInfoBuilder_ == null) {
          if (privilegeInfo_ != null) {
            privilegeInfo_ =
              emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.newBuilder(privilegeInfo_).mergeFrom(value).buildPartial();
          } else {
            privilegeInfo_ = value;
          }
          onChanged();
        } else {
          privilegeInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
       */
      public Builder clearPrivilegeInfo() {
        if (privilegeInfoBuilder_ == null) {
          privilegeInfo_ = null;
          onChanged();
        } else {
          privilegeInfo_ = null;
          privilegeInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
       */
      public emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.Builder getPrivilegeInfoBuilder() {
        
        onChanged();
        return getPrivilegeInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
       */
      public emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfoOrBuilder getPrivilegeInfoOrBuilder() {
        if (privilegeInfoBuilder_ != null) {
          return privilegeInfoBuilder_.getMessageOrBuilder();
        } else {
          return privilegeInfo_ == null ?
              emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.getDefaultInstance() : privilegeInfo_;
        }
      }
      /**
       * <code>.ReunionPrivilegeInfo privilege_info = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo, emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.Builder, emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfoOrBuilder> 
          getPrivilegeInfoFieldBuilder() {
        if (privilegeInfoBuilder_ == null) {
          privilegeInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo, emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.Builder, emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfoOrBuilder>(
                  getPrivilegeInfo(),
                  getParentForChildren(),
                  isClean());
          privilegeInfo_ = null;
        }
        return privilegeInfoBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GetReunionPrivilegeInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetReunionPrivilegeInfoRsp)
    private static final emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp();
    }

    public static emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetReunionPrivilegeInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetReunionPrivilegeInfoRsp>() {
      @java.lang.Override
      public GetReunionPrivilegeInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetReunionPrivilegeInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetReunionPrivilegeInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetReunionPrivilegeInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetReunionPrivilegeInfoRspOuterClass.GetReunionPrivilegeInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetReunionPrivilegeInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetReunionPrivilegeInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GetReunionPrivilegeInfoRsp.proto\032\032Reun" +
      "ionPrivilegeInfo.proto\"\\\n\032GetReunionPriv" +
      "ilegeInfoRsp\022-\n\016privilege_info\030\005 \001(\0132\025.R" +
      "eunionPrivilegeInfo\022\017\n\007retcode\030\002 \001(\005B\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.getDescriptor(),
        });
    internal_static_GetReunionPrivilegeInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetReunionPrivilegeInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetReunionPrivilegeInfoRsp_descriptor,
        new java.lang.String[] { "PrivilegeInfo", "Retcode", });
    emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
