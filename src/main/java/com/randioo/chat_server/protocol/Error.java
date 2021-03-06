// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Error.proto

package com.randioo.chat_server.protocol;

public final class Error {
  private Error() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum ErrorCode
      implements com.google.protobuf.ProtocolMessageEnum {
    OK(0, 1),
    NO_STRING(1, 2),
    REJECT_LOGIN(2, 3),
    CONNECT_ERROR(3, 4),
    ;
    
    
    public final int getNumber() { return value; }
    
    public static ErrorCode valueOf(int value) {
      switch (value) {
        case 1: return OK;
        case 2: return NO_STRING;
        case 3: return REJECT_LOGIN;
        case 4: return CONNECT_ERROR;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<ErrorCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ErrorCode>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ErrorCode>() {
            public ErrorCode findValueByNumber(int number) {
              return ErrorCode.valueOf(number)
    ;        }
          };
    
    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.randioo.chat_server.protocol.Error.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final ErrorCode[] VALUES = {
      OK, NO_STRING, REJECT_LOGIN, CONNECT_ERROR, 
    };
    public static ErrorCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    private final int index;
    private final int value;
    private ErrorCode(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    static {
      com.randioo.chat_server.protocol.Error.getDescriptor();
    }
    
    // @@protoc_insertion_point(enum_scope:com.randioo.chat_server.protocol.ErrorCode)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Error.proto\022 com.randioo.chat_server.p" +
      "rotocol*G\n\tErrorCode\022\006\n\002OK\020\001\022\r\n\tNO_STRIN" +
      "G\020\002\022\020\n\014REJECT_LOGIN\020\003\022\021\n\rCONNECT_ERROR\020\004"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
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
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
