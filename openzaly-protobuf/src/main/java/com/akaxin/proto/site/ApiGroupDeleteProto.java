// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: site/api_group_delete.proto

package com.akaxin.proto.site;

public final class ApiGroupDeleteProto {
  private ApiGroupDeleteProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ApiGroupDeleteRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiGroupDeleteRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *删除的群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    java.lang.String getGroupId();
    /**
     * <pre>
     *删除的群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupIdBytes();
  }
  /**
   * Protobuf type {@code site.ApiGroupDeleteRequest}
   */
  public  static final class ApiGroupDeleteRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:site.ApiGroupDeleteRequest)
      ApiGroupDeleteRequestOrBuilder {
    // Use ApiGroupDeleteRequest.newBuilder() to construct.
    private ApiGroupDeleteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ApiGroupDeleteRequest() {
      groupId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ApiGroupDeleteRequest(
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

              groupId_ = s;
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
      return com.akaxin.proto.site.ApiGroupDeleteProto.internal_static_site_ApiGroupDeleteRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.site.ApiGroupDeleteProto.internal_static_site_ApiGroupDeleteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest.class, com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest.Builder.class);
    }

    public static final int GROUP_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object groupId_;
    /**
     * <pre>
     *删除的群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *删除的群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupId_ = b;
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
      if (!getGroupIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupId_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getGroupIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupId_);
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
      if (!(obj instanceof com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest)) {
        return super.equals(obj);
      }
      com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest other = (com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest) obj;

      boolean result = true;
      result = result && getGroupId()
          .equals(other.getGroupId());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest parseFrom(
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
    public static Builder newBuilder(com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest prototype) {
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
     * Protobuf type {@code site.ApiGroupDeleteRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiGroupDeleteRequest)
        com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.site.ApiGroupDeleteProto.internal_static_site_ApiGroupDeleteRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.site.ApiGroupDeleteProto.internal_static_site_ApiGroupDeleteRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest.class, com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest.Builder.class);
      }

      // Construct using com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest.newBuilder()
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
        groupId_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.site.ApiGroupDeleteProto.internal_static_site_ApiGroupDeleteRequest_descriptor;
      }

      public com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest getDefaultInstanceForType() {
        return com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest.getDefaultInstance();
      }

      public com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest build() {
        com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest buildPartial() {
        com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest result = new com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest(this);
        result.groupId_ = groupId_;
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
        if (other instanceof com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest) {
          return mergeFrom((com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest other) {
        if (other == com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest.getDefaultInstance()) return this;
        if (!other.getGroupId().isEmpty()) {
          groupId_ = other.groupId_;
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
        com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object groupId_ = "";
      /**
       * <pre>
       *删除的群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public java.lang.String getGroupId() {
        java.lang.Object ref = groupId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          groupId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *删除的群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupIdBytes() {
        java.lang.Object ref = groupId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          groupId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *删除的群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public Builder setGroupId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *删除的群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public Builder clearGroupId() {
        
        groupId_ = getDefaultInstance().getGroupId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *删除的群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public Builder setGroupIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupId_ = value;
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


      // @@protoc_insertion_point(builder_scope:site.ApiGroupDeleteRequest)
    }

    // @@protoc_insertion_point(class_scope:site.ApiGroupDeleteRequest)
    private static final com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest();
    }

    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ApiGroupDeleteRequest>
        PARSER = new com.google.protobuf.AbstractParser<ApiGroupDeleteRequest>() {
      public ApiGroupDeleteRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ApiGroupDeleteRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ApiGroupDeleteRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ApiGroupDeleteRequest> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ApiGroupDeleteResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiGroupDeleteResponse)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code site.ApiGroupDeleteResponse}
   */
  public  static final class ApiGroupDeleteResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:site.ApiGroupDeleteResponse)
      ApiGroupDeleteResponseOrBuilder {
    // Use ApiGroupDeleteResponse.newBuilder() to construct.
    private ApiGroupDeleteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ApiGroupDeleteResponse() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ApiGroupDeleteResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
      return com.akaxin.proto.site.ApiGroupDeleteProto.internal_static_site_ApiGroupDeleteResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.site.ApiGroupDeleteProto.internal_static_site_ApiGroupDeleteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse.class, com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse.Builder.class);
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
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse)) {
        return super.equals(obj);
      }
      com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse other = (com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse) obj;

      boolean result = true;
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse parseFrom(
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
    public static Builder newBuilder(com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse prototype) {
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
     * Protobuf type {@code site.ApiGroupDeleteResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiGroupDeleteResponse)
        com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.site.ApiGroupDeleteProto.internal_static_site_ApiGroupDeleteResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.site.ApiGroupDeleteProto.internal_static_site_ApiGroupDeleteResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse.class, com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse.Builder.class);
      }

      // Construct using com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse.newBuilder()
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
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.site.ApiGroupDeleteProto.internal_static_site_ApiGroupDeleteResponse_descriptor;
      }

      public com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse getDefaultInstanceForType() {
        return com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse.getDefaultInstance();
      }

      public com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse build() {
        com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse buildPartial() {
        com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse result = new com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse(this);
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
        if (other instanceof com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse) {
          return mergeFrom((com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse other) {
        if (other == com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse.getDefaultInstance()) return this;
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
        com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:site.ApiGroupDeleteResponse)
    }

    // @@protoc_insertion_point(class_scope:site.ApiGroupDeleteResponse)
    private static final com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse();
    }

    public static com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ApiGroupDeleteResponse>
        PARSER = new com.google.protobuf.AbstractParser<ApiGroupDeleteResponse>() {
      public ApiGroupDeleteResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ApiGroupDeleteResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ApiGroupDeleteResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ApiGroupDeleteResponse> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.site.ApiGroupDeleteProto.ApiGroupDeleteResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_site_ApiGroupDeleteRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_site_ApiGroupDeleteRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_site_ApiGroupDeleteResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_site_ApiGroupDeleteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033site/api_group_delete.proto\022\004site\")\n\025A" +
      "piGroupDeleteRequest\022\020\n\010group_id\030\001 \001(\t\"\030" +
      "\n\026ApiGroupDeleteResponse2\\\n\025ApiGroupDele" +
      "teService\022C\n\006delete\022\033.site.ApiGroupDelet" +
      "eRequest\032\034.site.ApiGroupDeleteResponseB," +
      "\n\025com.akaxin.proto.siteB\023ApiGroupDeleteP" +
      "rotob\006proto3"
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
    internal_static_site_ApiGroupDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_site_ApiGroupDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_site_ApiGroupDeleteRequest_descriptor,
        new java.lang.String[] { "GroupId", });
    internal_static_site_ApiGroupDeleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_site_ApiGroupDeleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_site_ApiGroupDeleteResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
