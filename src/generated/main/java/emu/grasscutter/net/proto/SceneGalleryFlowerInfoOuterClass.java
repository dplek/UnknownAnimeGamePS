// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryFlowerInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryFlowerInfoOuterClass {
  private SceneGalleryFlowerInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryFlowerInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryFlowerInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cur_score = 10;</code>
     * @return The curScore.
     */
    int getCurScore();

    /**
     * <code>uint32 target_score = 4;</code>
     * @return The targetScore.
     */
    int getTargetScore();

    /**
     * <code>uint32 end_time = 1;</code>
     * @return The endTime.
     */
    int getEndTime();
  }
  /**
   * <pre>
   * Obf: GDLNENFGMCP
   * </pre>
   *
   * Protobuf type {@code SceneGalleryFlowerInfo}
   */
  public static final class SceneGalleryFlowerInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryFlowerInfo)
      SceneGalleryFlowerInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryFlowerInfo.newBuilder() to construct.
    private SceneGalleryFlowerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryFlowerInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryFlowerInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryFlowerInfo(
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
            case 8: {

              endTime_ = input.readUInt32();
              break;
            }
            case 32: {

              targetScore_ = input.readUInt32();
              break;
            }
            case 80: {

              curScore_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.internal_static_SceneGalleryFlowerInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.internal_static_SceneGalleryFlowerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo.class, emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo.Builder.class);
    }

    public static final int CUR_SCORE_FIELD_NUMBER = 10;
    private int curScore_;
    /**
     * <code>uint32 cur_score = 10;</code>
     * @return The curScore.
     */
    @java.lang.Override
    public int getCurScore() {
      return curScore_;
    }

    public static final int TARGET_SCORE_FIELD_NUMBER = 4;
    private int targetScore_;
    /**
     * <code>uint32 target_score = 4;</code>
     * @return The targetScore.
     */
    @java.lang.Override
    public int getTargetScore() {
      return targetScore_;
    }

    public static final int END_TIME_FIELD_NUMBER = 1;
    private int endTime_;
    /**
     * <code>uint32 end_time = 1;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
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
      if (endTime_ != 0) {
        output.writeUInt32(1, endTime_);
      }
      if (targetScore_ != 0) {
        output.writeUInt32(4, targetScore_);
      }
      if (curScore_ != 0) {
        output.writeUInt32(10, curScore_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, endTime_);
      }
      if (targetScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, targetScore_);
      }
      if (curScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, curScore_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo other = (emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo) obj;

      if (getCurScore()
          != other.getCurScore()) return false;
      if (getTargetScore()
          != other.getTargetScore()) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
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
      hash = (37 * hash) + CUR_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getCurScore();
      hash = (37 * hash) + TARGET_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getTargetScore();
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo prototype) {
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
     * Obf: GDLNENFGMCP
     * </pre>
     *
     * Protobuf type {@code SceneGalleryFlowerInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryFlowerInfo)
        emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.internal_static_SceneGalleryFlowerInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.internal_static_SceneGalleryFlowerInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo.class, emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo.newBuilder()
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
        curScore_ = 0;

        targetScore_ = 0;

        endTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.internal_static_SceneGalleryFlowerInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo build() {
        emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo result = new emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo(this);
        result.curScore_ = curScore_;
        result.targetScore_ = targetScore_;
        result.endTime_ = endTime_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo.getDefaultInstance()) return this;
        if (other.getCurScore() != 0) {
          setCurScore(other.getCurScore());
        }
        if (other.getTargetScore() != 0) {
          setTargetScore(other.getTargetScore());
        }
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
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
        emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int curScore_ ;
      /**
       * <code>uint32 cur_score = 10;</code>
       * @return The curScore.
       */
      @java.lang.Override
      public int getCurScore() {
        return curScore_;
      }
      /**
       * <code>uint32 cur_score = 10;</code>
       * @param value The curScore to set.
       * @return This builder for chaining.
       */
      public Builder setCurScore(int value) {
        
        curScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_score = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurScore() {
        
        curScore_ = 0;
        onChanged();
        return this;
      }

      private int targetScore_ ;
      /**
       * <code>uint32 target_score = 4;</code>
       * @return The targetScore.
       */
      @java.lang.Override
      public int getTargetScore() {
        return targetScore_;
      }
      /**
       * <code>uint32 target_score = 4;</code>
       * @param value The targetScore to set.
       * @return This builder for chaining.
       */
      public Builder setTargetScore(int value) {
        
        targetScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_score = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetScore() {
        
        targetScore_ = 0;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 1;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 1;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryFlowerInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryFlowerInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryFlowerInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryFlowerInfo>() {
      @java.lang.Override
      public SceneGalleryFlowerInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryFlowerInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryFlowerInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryFlowerInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryFlowerInfoOuterClass.SceneGalleryFlowerInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryFlowerInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryFlowerInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SceneGalleryFlowerInfo.proto\"S\n\026SceneG" +
      "alleryFlowerInfo\022\021\n\tcur_score\030\n \001(\r\022\024\n\014t" +
      "arget_score\030\004 \001(\r\022\020\n\010end_time\030\001 \001(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryFlowerInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryFlowerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryFlowerInfo_descriptor,
        new java.lang.String[] { "CurScore", "TargetScore", "EndTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}