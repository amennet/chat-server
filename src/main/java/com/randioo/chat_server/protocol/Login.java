// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Login.proto

package com.randioo.chat_server.protocol;

public final class Login {
  private Login() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class LoginRequest extends
      com.google.protobuf.GeneratedMessage {
    // Use LoginRequest.newBuilder() to construct.
    private LoginRequest() {
      initFields();
    }
    private LoginRequest(boolean noInit) {}
    
    private static final LoginRequest defaultInstance;
    public static LoginRequest getDefaultInstance() {
      return defaultInstance;
    }
    
    public LoginRequest getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.randioo.chat_server.protocol.Login.internal_static_com_randioo_chat_server_protocol_LoginRequest_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.randioo.chat_server.protocol.Login.internal_static_com_randioo_chat_server_protocol_LoginRequest_fieldAccessorTable;
    }
    
    // optional string account = 1;
    public static final int ACCOUNT_FIELD_NUMBER = 1;
    private boolean hasAccount;
    private java.lang.String account_ = "";
    public boolean hasAccount() { return hasAccount; }
    public java.lang.String getAccount() { return account_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasAccount()) {
        output.writeString(1, getAccount());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasAccount()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getAccount());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.randioo.chat_server.protocol.Login.LoginRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.randioo.chat_server.protocol.Login.LoginRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.chat_server.protocol.Login.LoginRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.randioo.chat_server.protocol.Login.LoginRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.chat_server.protocol.Login.LoginRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.randioo.chat_server.protocol.Login.LoginRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.chat_server.protocol.Login.LoginRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.randioo.chat_server.protocol.Login.LoginRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.randioo.chat_server.protocol.Login.LoginRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.randioo.chat_server.protocol.Login.LoginRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.randioo.chat_server.protocol.Login.LoginRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.randioo.chat_server.protocol.Login.LoginRequest result;
      
      // Construct using com.randioo.chat_server.protocol.Login.LoginRequest.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.randioo.chat_server.protocol.Login.LoginRequest();
        return builder;
      }
      
      protected com.randioo.chat_server.protocol.Login.LoginRequest internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.randioo.chat_server.protocol.Login.LoginRequest();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.randioo.chat_server.protocol.Login.LoginRequest.getDescriptor();
      }
      
      public com.randioo.chat_server.protocol.Login.LoginRequest getDefaultInstanceForType() {
        return com.randioo.chat_server.protocol.Login.LoginRequest.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.randioo.chat_server.protocol.Login.LoginRequest build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.randioo.chat_server.protocol.Login.LoginRequest buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.randioo.chat_server.protocol.Login.LoginRequest buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.randioo.chat_server.protocol.Login.LoginRequest returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.randioo.chat_server.protocol.Login.LoginRequest) {
          return mergeFrom((com.randioo.chat_server.protocol.Login.LoginRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.randioo.chat_server.protocol.Login.LoginRequest other) {
        if (other == com.randioo.chat_server.protocol.Login.LoginRequest.getDefaultInstance()) return this;
        if (other.hasAccount()) {
          setAccount(other.getAccount());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setAccount(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional string account = 1;
      public boolean hasAccount() {
        return result.hasAccount();
      }
      public java.lang.String getAccount() {
        return result.getAccount();
      }
      public Builder setAccount(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasAccount = true;
        result.account_ = value;
        return this;
      }
      public Builder clearAccount() {
        result.hasAccount = false;
        result.account_ = getDefaultInstance().getAccount();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.randioo.chat_server.protocol.LoginRequest)
    }
    
    static {
      defaultInstance = new LoginRequest(true);
      com.randioo.chat_server.protocol.Login.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.randioo.chat_server.protocol.LoginRequest)
  }
  
  public static final class LoginResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use LoginResponse.newBuilder() to construct.
    private LoginResponse() {
      initFields();
    }
    private LoginResponse(boolean noInit) {}
    
    private static final LoginResponse defaultInstance;
    public static LoginResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public LoginResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.randioo.chat_server.protocol.Login.internal_static_com_randioo_chat_server_protocol_LoginResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.randioo.chat_server.protocol.Login.internal_static_com_randioo_chat_server_protocol_LoginResponse_fieldAccessorTable;
    }
    
    // optional int32 errorCode = 1 [default = 1];
    public static final int ERRORCODE_FIELD_NUMBER = 1;
    private boolean hasErrorCode;
    private int errorCode_ = 1;
    public boolean hasErrorCode() { return hasErrorCode; }
    public int getErrorCode() { return errorCode_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasErrorCode()) {
        output.writeInt32(1, getErrorCode());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasErrorCode()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getErrorCode());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.randioo.chat_server.protocol.Login.LoginResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.randioo.chat_server.protocol.Login.LoginResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.chat_server.protocol.Login.LoginResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.randioo.chat_server.protocol.Login.LoginResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.chat_server.protocol.Login.LoginResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.randioo.chat_server.protocol.Login.LoginResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.chat_server.protocol.Login.LoginResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.randioo.chat_server.protocol.Login.LoginResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.randioo.chat_server.protocol.Login.LoginResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.randioo.chat_server.protocol.Login.LoginResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.randioo.chat_server.protocol.Login.LoginResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.randioo.chat_server.protocol.Login.LoginResponse result;
      
      // Construct using com.randioo.chat_server.protocol.Login.LoginResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.randioo.chat_server.protocol.Login.LoginResponse();
        return builder;
      }
      
      protected com.randioo.chat_server.protocol.Login.LoginResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.randioo.chat_server.protocol.Login.LoginResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.randioo.chat_server.protocol.Login.LoginResponse.getDescriptor();
      }
      
      public com.randioo.chat_server.protocol.Login.LoginResponse getDefaultInstanceForType() {
        return com.randioo.chat_server.protocol.Login.LoginResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.randioo.chat_server.protocol.Login.LoginResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.randioo.chat_server.protocol.Login.LoginResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.randioo.chat_server.protocol.Login.LoginResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.randioo.chat_server.protocol.Login.LoginResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.randioo.chat_server.protocol.Login.LoginResponse) {
          return mergeFrom((com.randioo.chat_server.protocol.Login.LoginResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.randioo.chat_server.protocol.Login.LoginResponse other) {
        if (other == com.randioo.chat_server.protocol.Login.LoginResponse.getDefaultInstance()) return this;
        if (other.hasErrorCode()) {
          setErrorCode(other.getErrorCode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setErrorCode(input.readInt32());
              break;
            }
          }
        }
      }
      
      
      // optional int32 errorCode = 1 [default = 1];
      public boolean hasErrorCode() {
        return result.hasErrorCode();
      }
      public int getErrorCode() {
        return result.getErrorCode();
      }
      public Builder setErrorCode(int value) {
        result.hasErrorCode = true;
        result.errorCode_ = value;
        return this;
      }
      public Builder clearErrorCode() {
        result.hasErrorCode = false;
        result.errorCode_ = 1;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.randioo.chat_server.protocol.LoginResponse)
    }
    
    static {
      defaultInstance = new LoginResponse(true);
      com.randioo.chat_server.protocol.Login.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.randioo.chat_server.protocol.LoginResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_randioo_chat_server_protocol_LoginRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_randioo_chat_server_protocol_LoginRequest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_randioo_chat_server_protocol_LoginResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_randioo_chat_server_protocol_LoginResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Login.proto\022 com.randioo.chat_server.p" +
      "rotocol\032\014Entity.proto\"\037\n\014LoginRequest\022\017\n" +
      "\007account\030\001 \001(\t\"%\n\rLoginResponse\022\024\n\terror" +
      "Code\030\001 \001(\005:\0011"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_randioo_chat_server_protocol_LoginRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_randioo_chat_server_protocol_LoginRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_randioo_chat_server_protocol_LoginRequest_descriptor,
              new java.lang.String[] { "Account", },
              com.randioo.chat_server.protocol.Login.LoginRequest.class,
              com.randioo.chat_server.protocol.Login.LoginRequest.Builder.class);
          internal_static_com_randioo_chat_server_protocol_LoginResponse_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_com_randioo_chat_server_protocol_LoginResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_randioo_chat_server_protocol_LoginResponse_descriptor,
              new java.lang.String[] { "ErrorCode", },
              com.randioo.chat_server.protocol.Login.LoginResponse.class,
              com.randioo.chat_server.protocol.Login.LoginResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.randioo.chat_server.protocol.Entity.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
