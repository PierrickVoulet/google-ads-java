// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/asset_types.proto

package com.google.ads.googleads.v1.common;

public final class AssetTypesProto {
  private AssetTypesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_YoutubeVideoAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_YoutubeVideoAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_MediaBundleAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_MediaBundleAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_ImageAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_ImageAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_ImageDimension_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_ImageDimension_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v1/common/asset_t" +
      "ypes.proto\022\036google.ads.googleads.v1.comm" +
      "on\032-google/ads/googleads/v1/enums/mime_t" +
      "ype.proto\032\036google/protobuf/wrappers.prot" +
      "o\032\034google/api/annotations.proto\"K\n\021Youtu" +
      "beVideoAsset\0226\n\020youtube_video_id\030\001 \001(\0132\034" +
      ".google.protobuf.StringValue\"=\n\020MediaBun" +
      "dleAsset\022)\n\004data\030\001 \001(\0132\033.google.protobuf" +
      ".BytesValue\"\363\001\n\nImageAsset\022)\n\004data\030\001 \001(\013" +
      "2\033.google.protobuf.BytesValue\022.\n\tfile_si" +
      "ze\030\002 \001(\0132\033.google.protobuf.Int64Value\022G\n" +
      "\tmime_type\030\003 \001(\01624.google.ads.googleads." +
      "v1.enums.MimeTypeEnum.MimeType\022A\n\tfull_s" +
      "ize\030\004 \001(\0132..google.ads.googleads.v1.comm" +
      "on.ImageDimension\"\242\001\n\016ImageDimension\0222\n\r" +
      "height_pixels\030\001 \001(\0132\033.google.protobuf.In" +
      "t64Value\0221\n\014width_pixels\030\002 \001(\0132\033.google." +
      "protobuf.Int64Value\022)\n\003url\030\003 \001(\0132\034.googl" +
      "e.protobuf.StringValueB\352\001\n\"com.google.ad" +
      "s.googleads.v1.commonB\017AssetTypesProtoP\001" +
      "ZDgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v1/common;common\242\002\003GAA\252\002\036G" +
      "oogle.Ads.GoogleAds.V1.Common\312\002\036Google\\A" +
      "ds\\GoogleAds\\V1\\Common\352\002\"Google::Ads::Go" +
      "ogleAds::V1::Commonb\006proto3"
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
          com.google.ads.googleads.v1.enums.MimeTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_common_YoutubeVideoAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_common_YoutubeVideoAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_YoutubeVideoAsset_descriptor,
        new java.lang.String[] { "YoutubeVideoId", });
    internal_static_google_ads_googleads_v1_common_MediaBundleAsset_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_common_MediaBundleAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_MediaBundleAsset_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_google_ads_googleads_v1_common_ImageAsset_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_common_ImageAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_ImageAsset_descriptor,
        new java.lang.String[] { "Data", "FileSize", "MimeType", "FullSize", });
    internal_static_google_ads_googleads_v1_common_ImageDimension_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_common_ImageDimension_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_ImageDimension_descriptor,
        new java.lang.String[] { "HeightPixels", "WidthPixels", "Url", });
    com.google.ads.googleads.v1.enums.MimeTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}