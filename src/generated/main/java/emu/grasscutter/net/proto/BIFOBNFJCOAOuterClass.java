// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BIFOBNFJCOA.proto

package emu.grasscutter.net.proto;

public final class BIFOBNFJCOAOuterClass {
  private BIFOBNFJCOAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BIFOBNFJCOAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BIFOBNFJCOA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 EHKDOAMAOBK = 8;</code>
     * @return The eHKDOAMAOBK.
     */
    int getEHKDOAMAOBK();

    /**
     * <code>repeated uint32 APCFHCPFONE = 9;</code>
     * @return A list containing the aPCFHCPFONE.
     */
    java.util.List<java.lang.Integer> getAPCFHCPFONEList();
    /**
     * <code>repeated uint32 APCFHCPFONE = 9;</code>
     * @return The count of aPCFHCPFONE.
     */
    int getAPCFHCPFONECount();
    /**
     * <code>repeated uint32 APCFHCPFONE = 9;</code>
     * @param index The index of the element to return.
     * @return The aPCFHCPFONE at the given index.
     */
    int getAPCFHCPFONE(int index);
  }
  /**
   * Protobuf type {@code BIFOBNFJCOA}
   */
  public static final class BIFOBNFJCOA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BIFOBNFJCOA)
      BIFOBNFJCOAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BIFOBNFJCOA.newBuilder() to construct.
    private BIFOBNFJCOA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BIFOBNFJCOA() {
      aPCFHCPFONE_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BIFOBNFJCOA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BIFOBNFJCOA(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 64: {

              eHKDOAMAOBK_ = input.readUInt32();
              break;
            }
            case 72: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                aPCFHCPFONE_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              aPCFHCPFONE_.addInt(input.readUInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                aPCFHCPFONE_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                aPCFHCPFONE_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          aPCFHCPFONE_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.internal_static_BIFOBNFJCOA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.internal_static_BIFOBNFJCOA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA.class, emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA.Builder.class);
    }

    public static final int EHKDOAMAOBK_FIELD_NUMBER = 8;
    private int eHKDOAMAOBK_;
    /**
     * <code>uint32 EHKDOAMAOBK = 8;</code>
     * @return The eHKDOAMAOBK.
     */
    @java.lang.Override
    public int getEHKDOAMAOBK() {
      return eHKDOAMAOBK_;
    }

    public static final int APCFHCPFONE_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList aPCFHCPFONE_;
    /**
     * <code>repeated uint32 APCFHCPFONE = 9;</code>
     * @return A list containing the aPCFHCPFONE.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAPCFHCPFONEList() {
      return aPCFHCPFONE_;
    }
    /**
     * <code>repeated uint32 APCFHCPFONE = 9;</code>
     * @return The count of aPCFHCPFONE.
     */
    public int getAPCFHCPFONECount() {
      return aPCFHCPFONE_.size();
    }
    /**
     * <code>repeated uint32 APCFHCPFONE = 9;</code>
     * @param index The index of the element to return.
     * @return The aPCFHCPFONE at the given index.
     */
    public int getAPCFHCPFONE(int index) {
      return aPCFHCPFONE_.getInt(index);
    }
    private int aPCFHCPFONEMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (eHKDOAMAOBK_ != 0) {
        output.writeUInt32(8, eHKDOAMAOBK_);
      }
      if (getAPCFHCPFONEList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(aPCFHCPFONEMemoizedSerializedSize);
      }
      for (int i = 0; i < aPCFHCPFONE_.size(); i++) {
        output.writeUInt32NoTag(aPCFHCPFONE_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eHKDOAMAOBK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, eHKDOAMAOBK_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < aPCFHCPFONE_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(aPCFHCPFONE_.getInt(i));
        }
        size += dataSize;
        if (!getAPCFHCPFONEList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        aPCFHCPFONEMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA other = (emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA) obj;

      if (getEHKDOAMAOBK()
          != other.getEHKDOAMAOBK()) return false;
      if (!getAPCFHCPFONEList()
          .equals(other.getAPCFHCPFONEList())) return false;
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
      hash = (37 * hash) + EHKDOAMAOBK_FIELD_NUMBER;
      hash = (53 * hash) + getEHKDOAMAOBK();
      if (getAPCFHCPFONECount() > 0) {
        hash = (37 * hash) + APCFHCPFONE_FIELD_NUMBER;
        hash = (53 * hash) + getAPCFHCPFONEList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA prototype) {
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
     * Protobuf type {@code BIFOBNFJCOA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BIFOBNFJCOA)
        emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.internal_static_BIFOBNFJCOA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.internal_static_BIFOBNFJCOA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA.class, emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA.newBuilder()
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
        eHKDOAMAOBK_ = 0;

        aPCFHCPFONE_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.internal_static_BIFOBNFJCOA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA build() {
        emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA buildPartial() {
        emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA result = new emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA(this);
        int from_bitField0_ = bitField0_;
        result.eHKDOAMAOBK_ = eHKDOAMAOBK_;
        if (((bitField0_ & 0x00000001) != 0)) {
          aPCFHCPFONE_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.aPCFHCPFONE_ = aPCFHCPFONE_;
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
        if (other instanceof emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA) {
          return mergeFrom((emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA other) {
        if (other == emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA.getDefaultInstance()) return this;
        if (other.getEHKDOAMAOBK() != 0) {
          setEHKDOAMAOBK(other.getEHKDOAMAOBK());
        }
        if (!other.aPCFHCPFONE_.isEmpty()) {
          if (aPCFHCPFONE_.isEmpty()) {
            aPCFHCPFONE_ = other.aPCFHCPFONE_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAPCFHCPFONEIsMutable();
            aPCFHCPFONE_.addAll(other.aPCFHCPFONE_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int eHKDOAMAOBK_ ;
      /**
       * <code>uint32 EHKDOAMAOBK = 8;</code>
       * @return The eHKDOAMAOBK.
       */
      @java.lang.Override
      public int getEHKDOAMAOBK() {
        return eHKDOAMAOBK_;
      }
      /**
       * <code>uint32 EHKDOAMAOBK = 8;</code>
       * @param value The eHKDOAMAOBK to set.
       * @return This builder for chaining.
       */
      public Builder setEHKDOAMAOBK(int value) {
        
        eHKDOAMAOBK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EHKDOAMAOBK = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEHKDOAMAOBK() {
        
        eHKDOAMAOBK_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList aPCFHCPFONE_ = emptyIntList();
      private void ensureAPCFHCPFONEIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          aPCFHCPFONE_ = mutableCopy(aPCFHCPFONE_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 APCFHCPFONE = 9;</code>
       * @return A list containing the aPCFHCPFONE.
       */
      public java.util.List<java.lang.Integer>
          getAPCFHCPFONEList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(aPCFHCPFONE_) : aPCFHCPFONE_;
      }
      /**
       * <code>repeated uint32 APCFHCPFONE = 9;</code>
       * @return The count of aPCFHCPFONE.
       */
      public int getAPCFHCPFONECount() {
        return aPCFHCPFONE_.size();
      }
      /**
       * <code>repeated uint32 APCFHCPFONE = 9;</code>
       * @param index The index of the element to return.
       * @return The aPCFHCPFONE at the given index.
       */
      public int getAPCFHCPFONE(int index) {
        return aPCFHCPFONE_.getInt(index);
      }
      /**
       * <code>repeated uint32 APCFHCPFONE = 9;</code>
       * @param index The index to set the value at.
       * @param value The aPCFHCPFONE to set.
       * @return This builder for chaining.
       */
      public Builder setAPCFHCPFONE(
          int index, int value) {
        ensureAPCFHCPFONEIsMutable();
        aPCFHCPFONE_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 APCFHCPFONE = 9;</code>
       * @param value The aPCFHCPFONE to add.
       * @return This builder for chaining.
       */
      public Builder addAPCFHCPFONE(int value) {
        ensureAPCFHCPFONEIsMutable();
        aPCFHCPFONE_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 APCFHCPFONE = 9;</code>
       * @param values The aPCFHCPFONE to add.
       * @return This builder for chaining.
       */
      public Builder addAllAPCFHCPFONE(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAPCFHCPFONEIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, aPCFHCPFONE_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 APCFHCPFONE = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearAPCFHCPFONE() {
        aPCFHCPFONE_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:BIFOBNFJCOA)
    }

    // @@protoc_insertion_point(class_scope:BIFOBNFJCOA)
    private static final emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA();
    }

    public static emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BIFOBNFJCOA>
        PARSER = new com.google.protobuf.AbstractParser<BIFOBNFJCOA>() {
      @java.lang.Override
      public BIFOBNFJCOA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BIFOBNFJCOA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BIFOBNFJCOA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BIFOBNFJCOA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BIFOBNFJCOAOuterClass.BIFOBNFJCOA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BIFOBNFJCOA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BIFOBNFJCOA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BIFOBNFJCOA.proto\"7\n\013BIFOBNFJCOA\022\023\n\013EH" +
      "KDOAMAOBK\030\010 \001(\r\022\023\n\013APCFHCPFONE\030\t \003(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BIFOBNFJCOA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BIFOBNFJCOA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BIFOBNFJCOA_descriptor,
        new java.lang.String[] { "EHKDOAMAOBK", "APCFHCPFONE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}