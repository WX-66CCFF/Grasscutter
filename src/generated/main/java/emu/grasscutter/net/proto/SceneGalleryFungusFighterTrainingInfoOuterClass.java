// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryFungusFighterTrainingInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryFungusFighterTrainingInfoOuterClass {
  private SceneGalleryFungusFighterTrainingInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryFungusFighterTrainingInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryFungusFighterTrainingInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 MPEELPGPHIJ = 2;</code>
     * @return The mPEELPGPHIJ.
     */
    int getMPEELPGPHIJ();

    /**
     * <code>uint32 buff_id = 13;</code>
     * @return The buffId.
     */
    int getBuffId();

    /**
     * <code>uint32 NHGJDJBLEFA = 12;</code>
     * @return The nHGJDJBLEFA.
     */
    int getNHGJDJBLEFA();

    /**
     * <code>uint32 KPCEBEHOKNO = 5;</code>
     * @return The kPCEBEHOKNO.
     */
    int getKPCEBEHOKNO();

    /**
     * <code>uint32 NDNFMHHOMCM = 7;</code>
     * @return The nDNFMHHOMCM.
     */
    int getNDNFMHHOMCM();

    /**
     * <code>uint32 CJLJCDGDKPD = 14;</code>
     * @return The cJLJCDGDKPD.
     */
    int getCJLJCDGDKPD();

    /**
     * <code>uint32 PJDEJHODAMK = 10;</code>
     * @return The pJDEJHODAMK.
     */
    int getPJDEJHODAMK();
  }
  /**
   * <pre>
   * Obf: LKGLMBEOEDK
   * </pre>
   *
   * Protobuf type {@code SceneGalleryFungusFighterTrainingInfo}
   */
  public static final class SceneGalleryFungusFighterTrainingInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryFungusFighterTrainingInfo)
      SceneGalleryFungusFighterTrainingInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryFungusFighterTrainingInfo.newBuilder() to construct.
    private SceneGalleryFungusFighterTrainingInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryFungusFighterTrainingInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryFungusFighterTrainingInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryFungusFighterTrainingInfo(
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

              mPEELPGPHIJ_ = input.readUInt32();
              break;
            }
            case 40: {

              kPCEBEHOKNO_ = input.readUInt32();
              break;
            }
            case 56: {

              nDNFMHHOMCM_ = input.readUInt32();
              break;
            }
            case 80: {

              pJDEJHODAMK_ = input.readUInt32();
              break;
            }
            case 96: {

              nHGJDJBLEFA_ = input.readUInt32();
              break;
            }
            case 104: {

              buffId_ = input.readUInt32();
              break;
            }
            case 112: {

              cJLJCDGDKPD_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.class, emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.Builder.class);
    }

    public static final int MPEELPGPHIJ_FIELD_NUMBER = 2;
    private int mPEELPGPHIJ_;
    /**
     * <code>uint32 MPEELPGPHIJ = 2;</code>
     * @return The mPEELPGPHIJ.
     */
    @java.lang.Override
    public int getMPEELPGPHIJ() {
      return mPEELPGPHIJ_;
    }

    public static final int BUFF_ID_FIELD_NUMBER = 13;
    private int buffId_;
    /**
     * <code>uint32 buff_id = 13;</code>
     * @return The buffId.
     */
    @java.lang.Override
    public int getBuffId() {
      return buffId_;
    }

    public static final int NHGJDJBLEFA_FIELD_NUMBER = 12;
    private int nHGJDJBLEFA_;
    /**
     * <code>uint32 NHGJDJBLEFA = 12;</code>
     * @return The nHGJDJBLEFA.
     */
    @java.lang.Override
    public int getNHGJDJBLEFA() {
      return nHGJDJBLEFA_;
    }

    public static final int KPCEBEHOKNO_FIELD_NUMBER = 5;
    private int kPCEBEHOKNO_;
    /**
     * <code>uint32 KPCEBEHOKNO = 5;</code>
     * @return The kPCEBEHOKNO.
     */
    @java.lang.Override
    public int getKPCEBEHOKNO() {
      return kPCEBEHOKNO_;
    }

    public static final int NDNFMHHOMCM_FIELD_NUMBER = 7;
    private int nDNFMHHOMCM_;
    /**
     * <code>uint32 NDNFMHHOMCM = 7;</code>
     * @return The nDNFMHHOMCM.
     */
    @java.lang.Override
    public int getNDNFMHHOMCM() {
      return nDNFMHHOMCM_;
    }

    public static final int CJLJCDGDKPD_FIELD_NUMBER = 14;
    private int cJLJCDGDKPD_;
    /**
     * <code>uint32 CJLJCDGDKPD = 14;</code>
     * @return The cJLJCDGDKPD.
     */
    @java.lang.Override
    public int getCJLJCDGDKPD() {
      return cJLJCDGDKPD_;
    }

    public static final int PJDEJHODAMK_FIELD_NUMBER = 10;
    private int pJDEJHODAMK_;
    /**
     * <code>uint32 PJDEJHODAMK = 10;</code>
     * @return The pJDEJHODAMK.
     */
    @java.lang.Override
    public int getPJDEJHODAMK() {
      return pJDEJHODAMK_;
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
      if (mPEELPGPHIJ_ != 0) {
        output.writeUInt32(2, mPEELPGPHIJ_);
      }
      if (kPCEBEHOKNO_ != 0) {
        output.writeUInt32(5, kPCEBEHOKNO_);
      }
      if (nDNFMHHOMCM_ != 0) {
        output.writeUInt32(7, nDNFMHHOMCM_);
      }
      if (pJDEJHODAMK_ != 0) {
        output.writeUInt32(10, pJDEJHODAMK_);
      }
      if (nHGJDJBLEFA_ != 0) {
        output.writeUInt32(12, nHGJDJBLEFA_);
      }
      if (buffId_ != 0) {
        output.writeUInt32(13, buffId_);
      }
      if (cJLJCDGDKPD_ != 0) {
        output.writeUInt32(14, cJLJCDGDKPD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mPEELPGPHIJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, mPEELPGPHIJ_);
      }
      if (kPCEBEHOKNO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, kPCEBEHOKNO_);
      }
      if (nDNFMHHOMCM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, nDNFMHHOMCM_);
      }
      if (pJDEJHODAMK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, pJDEJHODAMK_);
      }
      if (nHGJDJBLEFA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, nHGJDJBLEFA_);
      }
      if (buffId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, buffId_);
      }
      if (cJLJCDGDKPD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, cJLJCDGDKPD_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo other = (emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo) obj;

      if (getMPEELPGPHIJ()
          != other.getMPEELPGPHIJ()) return false;
      if (getBuffId()
          != other.getBuffId()) return false;
      if (getNHGJDJBLEFA()
          != other.getNHGJDJBLEFA()) return false;
      if (getKPCEBEHOKNO()
          != other.getKPCEBEHOKNO()) return false;
      if (getNDNFMHHOMCM()
          != other.getNDNFMHHOMCM()) return false;
      if (getCJLJCDGDKPD()
          != other.getCJLJCDGDKPD()) return false;
      if (getPJDEJHODAMK()
          != other.getPJDEJHODAMK()) return false;
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
      hash = (37 * hash) + MPEELPGPHIJ_FIELD_NUMBER;
      hash = (53 * hash) + getMPEELPGPHIJ();
      hash = (37 * hash) + BUFF_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuffId();
      hash = (37 * hash) + NHGJDJBLEFA_FIELD_NUMBER;
      hash = (53 * hash) + getNHGJDJBLEFA();
      hash = (37 * hash) + KPCEBEHOKNO_FIELD_NUMBER;
      hash = (53 * hash) + getKPCEBEHOKNO();
      hash = (37 * hash) + NDNFMHHOMCM_FIELD_NUMBER;
      hash = (53 * hash) + getNDNFMHHOMCM();
      hash = (37 * hash) + CJLJCDGDKPD_FIELD_NUMBER;
      hash = (53 * hash) + getCJLJCDGDKPD();
      hash = (37 * hash) + PJDEJHODAMK_FIELD_NUMBER;
      hash = (53 * hash) + getPJDEJHODAMK();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo prototype) {
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
     * Obf: LKGLMBEOEDK
     * </pre>
     *
     * Protobuf type {@code SceneGalleryFungusFighterTrainingInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryFungusFighterTrainingInfo)
        emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.class, emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.newBuilder()
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
        mPEELPGPHIJ_ = 0;

        buffId_ = 0;

        nHGJDJBLEFA_ = 0;

        kPCEBEHOKNO_ = 0;

        nDNFMHHOMCM_ = 0;

        cJLJCDGDKPD_ = 0;

        pJDEJHODAMK_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo build() {
        emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo result = new emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo(this);
        result.mPEELPGPHIJ_ = mPEELPGPHIJ_;
        result.buffId_ = buffId_;
        result.nHGJDJBLEFA_ = nHGJDJBLEFA_;
        result.kPCEBEHOKNO_ = kPCEBEHOKNO_;
        result.nDNFMHHOMCM_ = nDNFMHHOMCM_;
        result.cJLJCDGDKPD_ = cJLJCDGDKPD_;
        result.pJDEJHODAMK_ = pJDEJHODAMK_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.getDefaultInstance()) return this;
        if (other.getMPEELPGPHIJ() != 0) {
          setMPEELPGPHIJ(other.getMPEELPGPHIJ());
        }
        if (other.getBuffId() != 0) {
          setBuffId(other.getBuffId());
        }
        if (other.getNHGJDJBLEFA() != 0) {
          setNHGJDJBLEFA(other.getNHGJDJBLEFA());
        }
        if (other.getKPCEBEHOKNO() != 0) {
          setKPCEBEHOKNO(other.getKPCEBEHOKNO());
        }
        if (other.getNDNFMHHOMCM() != 0) {
          setNDNFMHHOMCM(other.getNDNFMHHOMCM());
        }
        if (other.getCJLJCDGDKPD() != 0) {
          setCJLJCDGDKPD(other.getCJLJCDGDKPD());
        }
        if (other.getPJDEJHODAMK() != 0) {
          setPJDEJHODAMK(other.getPJDEJHODAMK());
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
        emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int mPEELPGPHIJ_ ;
      /**
       * <code>uint32 MPEELPGPHIJ = 2;</code>
       * @return The mPEELPGPHIJ.
       */
      @java.lang.Override
      public int getMPEELPGPHIJ() {
        return mPEELPGPHIJ_;
      }
      /**
       * <code>uint32 MPEELPGPHIJ = 2;</code>
       * @param value The mPEELPGPHIJ to set.
       * @return This builder for chaining.
       */
      public Builder setMPEELPGPHIJ(int value) {
        
        mPEELPGPHIJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MPEELPGPHIJ = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMPEELPGPHIJ() {
        
        mPEELPGPHIJ_ = 0;
        onChanged();
        return this;
      }

      private int buffId_ ;
      /**
       * <code>uint32 buff_id = 13;</code>
       * @return The buffId.
       */
      @java.lang.Override
      public int getBuffId() {
        return buffId_;
      }
      /**
       * <code>uint32 buff_id = 13;</code>
       * @param value The buffId to set.
       * @return This builder for chaining.
       */
      public Builder setBuffId(int value) {
        
        buffId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buff_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuffId() {
        
        buffId_ = 0;
        onChanged();
        return this;
      }

      private int nHGJDJBLEFA_ ;
      /**
       * <code>uint32 NHGJDJBLEFA = 12;</code>
       * @return The nHGJDJBLEFA.
       */
      @java.lang.Override
      public int getNHGJDJBLEFA() {
        return nHGJDJBLEFA_;
      }
      /**
       * <code>uint32 NHGJDJBLEFA = 12;</code>
       * @param value The nHGJDJBLEFA to set.
       * @return This builder for chaining.
       */
      public Builder setNHGJDJBLEFA(int value) {
        
        nHGJDJBLEFA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NHGJDJBLEFA = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearNHGJDJBLEFA() {
        
        nHGJDJBLEFA_ = 0;
        onChanged();
        return this;
      }

      private int kPCEBEHOKNO_ ;
      /**
       * <code>uint32 KPCEBEHOKNO = 5;</code>
       * @return The kPCEBEHOKNO.
       */
      @java.lang.Override
      public int getKPCEBEHOKNO() {
        return kPCEBEHOKNO_;
      }
      /**
       * <code>uint32 KPCEBEHOKNO = 5;</code>
       * @param value The kPCEBEHOKNO to set.
       * @return This builder for chaining.
       */
      public Builder setKPCEBEHOKNO(int value) {
        
        kPCEBEHOKNO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KPCEBEHOKNO = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearKPCEBEHOKNO() {
        
        kPCEBEHOKNO_ = 0;
        onChanged();
        return this;
      }

      private int nDNFMHHOMCM_ ;
      /**
       * <code>uint32 NDNFMHHOMCM = 7;</code>
       * @return The nDNFMHHOMCM.
       */
      @java.lang.Override
      public int getNDNFMHHOMCM() {
        return nDNFMHHOMCM_;
      }
      /**
       * <code>uint32 NDNFMHHOMCM = 7;</code>
       * @param value The nDNFMHHOMCM to set.
       * @return This builder for chaining.
       */
      public Builder setNDNFMHHOMCM(int value) {
        
        nDNFMHHOMCM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NDNFMHHOMCM = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearNDNFMHHOMCM() {
        
        nDNFMHHOMCM_ = 0;
        onChanged();
        return this;
      }

      private int cJLJCDGDKPD_ ;
      /**
       * <code>uint32 CJLJCDGDKPD = 14;</code>
       * @return The cJLJCDGDKPD.
       */
      @java.lang.Override
      public int getCJLJCDGDKPD() {
        return cJLJCDGDKPD_;
      }
      /**
       * <code>uint32 CJLJCDGDKPD = 14;</code>
       * @param value The cJLJCDGDKPD to set.
       * @return This builder for chaining.
       */
      public Builder setCJLJCDGDKPD(int value) {
        
        cJLJCDGDKPD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CJLJCDGDKPD = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCJLJCDGDKPD() {
        
        cJLJCDGDKPD_ = 0;
        onChanged();
        return this;
      }

      private int pJDEJHODAMK_ ;
      /**
       * <code>uint32 PJDEJHODAMK = 10;</code>
       * @return The pJDEJHODAMK.
       */
      @java.lang.Override
      public int getPJDEJHODAMK() {
        return pJDEJHODAMK_;
      }
      /**
       * <code>uint32 PJDEJHODAMK = 10;</code>
       * @param value The pJDEJHODAMK to set.
       * @return This builder for chaining.
       */
      public Builder setPJDEJHODAMK(int value) {
        
        pJDEJHODAMK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PJDEJHODAMK = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearPJDEJHODAMK() {
        
        pJDEJHODAMK_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryFungusFighterTrainingInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryFungusFighterTrainingInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryFungusFighterTrainingInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryFungusFighterTrainingInfo>() {
      @java.lang.Override
      public SceneGalleryFungusFighterTrainingInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryFungusFighterTrainingInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryFungusFighterTrainingInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryFungusFighterTrainingInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryFungusFighterTrainingInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+SceneGalleryFungusFighterTrainingInfo." +
      "proto\"\266\001\n%SceneGalleryFungusFighterTrain" +
      "ingInfo\022\023\n\013MPEELPGPHIJ\030\002 \001(\r\022\017\n\007buff_id\030" +
      "\r \001(\r\022\023\n\013NHGJDJBLEFA\030\014 \001(\r\022\023\n\013KPCEBEHOKN" +
      "O\030\005 \001(\r\022\023\n\013NDNFMHHOMCM\030\007 \001(\r\022\023\n\013CJLJCDGD" +
      "KPD\030\016 \001(\r\022\023\n\013PJDEJHODAMK\030\n \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryFungusFighterTrainingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor,
        new java.lang.String[] { "MPEELPGPHIJ", "BuffId", "NHGJDJBLEFA", "KPCEBEHOKNO", "NDNFMHHOMCM", "CJLJCDGDKPD", "PJDEJHODAMK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
