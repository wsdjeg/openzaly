// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/file.proto

package com.akaxin.proto.core;

public final class FileProto {
  private FileProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code core.FileType}
   */
  public enum FileType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * 未知的文件类型类型
     * </pre>
     *
     * <code>UNKNOWN_FILE = 0;</code>
     */
    UNKNOWN_FILE(0),
    /**
     * <pre>
     *用户，群头像
     * </pre>
     *
     * <code>USER_PORTRAIT = 1;</code>
     */
    USER_PORTRAIT(1),
    /**
     * <pre>
     * 个人消息，群图片消息
     * </pre>
     *
     * <code>MESSAGE_IMAGE = 2;</code>
     */
    MESSAGE_IMAGE(2),
    /**
     * <pre>
     * 个人，群语音消息
     * </pre>
     *
     * <code>MESSAGE_VOICE = 3;</code>
     */
    MESSAGE_VOICE(3),
    /**
     * <pre>
     *群头像
     * </pre>
     *
     * <code>GROUP_PORTRAIT = 4;</code>
     */
    GROUP_PORTRAIT(4),
    /**
     * <pre>
     * 站点扩展图片存放位置
     * </pre>
     *
     * <code>SITE_PLUGIN = 5;</code>
     */
    SITE_PLUGIN(5),
    /**
     * <pre>
     *站点本身相关图片，例如站点logo
     * </pre>
     *
     * <code>SITE_ICON = 6;</code>
     */
    SITE_ICON(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * 未知的文件类型类型
     * </pre>
     *
     * <code>UNKNOWN_FILE = 0;</code>
     */
    public static final int UNKNOWN_FILE_VALUE = 0;
    /**
     * <pre>
     *用户，群头像
     * </pre>
     *
     * <code>USER_PORTRAIT = 1;</code>
     */
    public static final int USER_PORTRAIT_VALUE = 1;
    /**
     * <pre>
     * 个人消息，群图片消息
     * </pre>
     *
     * <code>MESSAGE_IMAGE = 2;</code>
     */
    public static final int MESSAGE_IMAGE_VALUE = 2;
    /**
     * <pre>
     * 个人，群语音消息
     * </pre>
     *
     * <code>MESSAGE_VOICE = 3;</code>
     */
    public static final int MESSAGE_VOICE_VALUE = 3;
    /**
     * <pre>
     *群头像
     * </pre>
     *
     * <code>GROUP_PORTRAIT = 4;</code>
     */
    public static final int GROUP_PORTRAIT_VALUE = 4;
    /**
     * <pre>
     * 站点扩展图片存放位置
     * </pre>
     *
     * <code>SITE_PLUGIN = 5;</code>
     */
    public static final int SITE_PLUGIN_VALUE = 5;
    /**
     * <pre>
     *站点本身相关图片，例如站点logo
     * </pre>
     *
     * <code>SITE_ICON = 6;</code>
     */
    public static final int SITE_ICON_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FileType valueOf(int value) {
      return forNumber(value);
    }

    public static FileType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_FILE;
        case 1: return USER_PORTRAIT;
        case 2: return MESSAGE_IMAGE;
        case 3: return MESSAGE_VOICE;
        case 4: return GROUP_PORTRAIT;
        case 5: return SITE_PLUGIN;
        case 6: return SITE_ICON;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FileType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FileType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FileType>() {
            public FileType findValueByNumber(int number) {
              return FileType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.akaxin.proto.core.FileProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final FileType[] VALUES = values();

    public static FileType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private FileType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:core.FileType)
  }

  public interface FileOrBuilder extends
      // @@protoc_insertion_point(interface_extends:core.File)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string file_id = 1;</code>
     */
    java.lang.String getFileId();
    /**
     * <code>optional string file_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getFileIdBytes();

    /**
     * <code>optional bytes file_content = 2;</code>
     */
    com.google.protobuf.ByteString getFileContent();

    /**
     * <code>optional .core.FileType file_type = 3;</code>
     */
    int getFileTypeValue();
    /**
     * <code>optional .core.FileType file_type = 3;</code>
     */
    com.akaxin.proto.core.FileProto.FileType getFileType();
  }
  /**
   * <pre>
   *最简单的用户信息，用于给别人呈现
   * </pre>
   *
   * Protobuf type {@code core.File}
   */
  public  static final class File extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:core.File)
      FileOrBuilder {
    // Use File.newBuilder() to construct.
    private File(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private File() {
      fileId_ = "";
      fileContent_ = com.google.protobuf.ByteString.EMPTY;
      fileType_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private File(
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
              java.lang.String s = input.readStringRequireUtf8();

              fileId_ = s;
              break;
            }
            case 18: {

              fileContent_ = input.readBytes();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              fileType_ = rawValue;
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
      return com.akaxin.proto.core.FileProto.internal_static_core_File_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.core.FileProto.internal_static_core_File_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.core.FileProto.File.class, com.akaxin.proto.core.FileProto.File.Builder.class);
    }

    public static final int FILE_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object fileId_;
    /**
     * <code>optional string file_id = 1;</code>
     */
    public java.lang.String getFileId() {
      java.lang.Object ref = fileId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileId_ = s;
        return s;
      }
    }
    /**
     * <code>optional string file_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFileIdBytes() {
      java.lang.Object ref = fileId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FILE_CONTENT_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString fileContent_;
    /**
     * <code>optional bytes file_content = 2;</code>
     */
    public com.google.protobuf.ByteString getFileContent() {
      return fileContent_;
    }

    public static final int FILE_TYPE_FIELD_NUMBER = 3;
    private int fileType_;
    /**
     * <code>optional .core.FileType file_type = 3;</code>
     */
    public int getFileTypeValue() {
      return fileType_;
    }
    /**
     * <code>optional .core.FileType file_type = 3;</code>
     */
    public com.akaxin.proto.core.FileProto.FileType getFileType() {
      com.akaxin.proto.core.FileProto.FileType result = com.akaxin.proto.core.FileProto.FileType.valueOf(fileType_);
      return result == null ? com.akaxin.proto.core.FileProto.FileType.UNRECOGNIZED : result;
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
      if (!getFileIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fileId_);
      }
      if (!fileContent_.isEmpty()) {
        output.writeBytes(2, fileContent_);
      }
      if (fileType_ != com.akaxin.proto.core.FileProto.FileType.UNKNOWN_FILE.getNumber()) {
        output.writeEnum(3, fileType_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getFileIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fileId_);
      }
      if (!fileContent_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, fileContent_);
      }
      if (fileType_ != com.akaxin.proto.core.FileProto.FileType.UNKNOWN_FILE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, fileType_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.akaxin.proto.core.FileProto.File)) {
        return super.equals(obj);
      }
      com.akaxin.proto.core.FileProto.File other = (com.akaxin.proto.core.FileProto.File) obj;

      boolean result = true;
      result = result && getFileId()
          .equals(other.getFileId());
      result = result && getFileContent()
          .equals(other.getFileContent());
      result = result && fileType_ == other.fileType_;
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + FILE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFileId().hashCode();
      hash = (37 * hash) + FILE_CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getFileContent().hashCode();
      hash = (37 * hash) + FILE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + fileType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.core.FileProto.File parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.core.FileProto.File parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.core.FileProto.File parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.core.FileProto.File parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.core.FileProto.File parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.core.FileProto.File parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.core.FileProto.File parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.core.FileProto.File parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.core.FileProto.File parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.core.FileProto.File parseFrom(
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
    public static Builder newBuilder(com.akaxin.proto.core.FileProto.File prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     *最简单的用户信息，用于给别人呈现
     * </pre>
     *
     * Protobuf type {@code core.File}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:core.File)
        com.akaxin.proto.core.FileProto.FileOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.core.FileProto.internal_static_core_File_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.core.FileProto.internal_static_core_File_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.core.FileProto.File.class, com.akaxin.proto.core.FileProto.File.Builder.class);
      }

      // Construct using com.akaxin.proto.core.FileProto.File.newBuilder()
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
        fileId_ = "";

        fileContent_ = com.google.protobuf.ByteString.EMPTY;

        fileType_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.core.FileProto.internal_static_core_File_descriptor;
      }

      public com.akaxin.proto.core.FileProto.File getDefaultInstanceForType() {
        return com.akaxin.proto.core.FileProto.File.getDefaultInstance();
      }

      public com.akaxin.proto.core.FileProto.File build() {
        com.akaxin.proto.core.FileProto.File result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.core.FileProto.File buildPartial() {
        com.akaxin.proto.core.FileProto.File result = new com.akaxin.proto.core.FileProto.File(this);
        result.fileId_ = fileId_;
        result.fileContent_ = fileContent_;
        result.fileType_ = fileType_;
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
        if (other instanceof com.akaxin.proto.core.FileProto.File) {
          return mergeFrom((com.akaxin.proto.core.FileProto.File)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.core.FileProto.File other) {
        if (other == com.akaxin.proto.core.FileProto.File.getDefaultInstance()) return this;
        if (!other.getFileId().isEmpty()) {
          fileId_ = other.fileId_;
          onChanged();
        }
        if (other.getFileContent() != com.google.protobuf.ByteString.EMPTY) {
          setFileContent(other.getFileContent());
        }
        if (other.fileType_ != 0) {
          setFileTypeValue(other.getFileTypeValue());
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
        com.akaxin.proto.core.FileProto.File parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.core.FileProto.File) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object fileId_ = "";
      /**
       * <code>optional string file_id = 1;</code>
       */
      public java.lang.String getFileId() {
        java.lang.Object ref = fileId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          fileId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string file_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getFileIdBytes() {
        java.lang.Object ref = fileId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fileId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string file_id = 1;</code>
       */
      public Builder setFileId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        fileId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string file_id = 1;</code>
       */
      public Builder clearFileId() {
        
        fileId_ = getDefaultInstance().getFileId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string file_id = 1;</code>
       */
      public Builder setFileIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        fileId_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString fileContent_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes file_content = 2;</code>
       */
      public com.google.protobuf.ByteString getFileContent() {
        return fileContent_;
      }
      /**
       * <code>optional bytes file_content = 2;</code>
       */
      public Builder setFileContent(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        fileContent_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes file_content = 2;</code>
       */
      public Builder clearFileContent() {
        
        fileContent_ = getDefaultInstance().getFileContent();
        onChanged();
        return this;
      }

      private int fileType_ = 0;
      /**
       * <code>optional .core.FileType file_type = 3;</code>
       */
      public int getFileTypeValue() {
        return fileType_;
      }
      /**
       * <code>optional .core.FileType file_type = 3;</code>
       */
      public Builder setFileTypeValue(int value) {
        fileType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .core.FileType file_type = 3;</code>
       */
      public com.akaxin.proto.core.FileProto.FileType getFileType() {
        com.akaxin.proto.core.FileProto.FileType result = com.akaxin.proto.core.FileProto.FileType.valueOf(fileType_);
        return result == null ? com.akaxin.proto.core.FileProto.FileType.UNRECOGNIZED : result;
      }
      /**
       * <code>optional .core.FileType file_type = 3;</code>
       */
      public Builder setFileType(com.akaxin.proto.core.FileProto.FileType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        fileType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .core.FileType file_type = 3;</code>
       */
      public Builder clearFileType() {
        
        fileType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:core.File)
    }

    // @@protoc_insertion_point(class_scope:core.File)
    private static final com.akaxin.proto.core.FileProto.File DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.core.FileProto.File();
    }

    public static com.akaxin.proto.core.FileProto.File getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<File>
        PARSER = new com.google.protobuf.AbstractParser<File>() {
      public File parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new File(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<File> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<File> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.core.FileProto.File getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_core_File_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_core_File_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017core/file.proto\022\004core\"P\n\004File\022\017\n\007file_" +
      "id\030\001 \001(\t\022\024\n\014file_content\030\002 \001(\014\022!\n\tfile_t" +
      "ype\030\003 \001(\0162\016.core.FileType*\211\001\n\010FileType\022\020" +
      "\n\014UNKNOWN_FILE\020\000\022\021\n\rUSER_PORTRAIT\020\001\022\021\n\rM" +
      "ESSAGE_IMAGE\020\002\022\021\n\rMESSAGE_VOICE\020\003\022\022\n\016GRO" +
      "UP_PORTRAIT\020\004\022\017\n\013SITE_PLUGIN\020\005\022\r\n\tSITE_I" +
      "CON\020\006B\"\n\025com.akaxin.proto.coreB\tFileProt" +
      "ob\006proto3"
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
    internal_static_core_File_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_core_File_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_core_File_descriptor,
        new java.lang.String[] { "FileId", "FileContent", "FileType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
