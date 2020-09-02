// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/product_bidding_category_constant.proto

package com.google.ads.googleads.v5.resources;

public final class ProductBiddingCategoryConstantProto {
  private ProductBiddingCategoryConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_ProductBiddingCategoryConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_ProductBiddingCategoryConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/ads/googleads/v5/resources/prod" +
      "uct_bidding_category_constant.proto\022!goo" +
      "gle.ads.googleads.v5.resources\032Bgoogle/a" +
      "ds/googleads/v5/enums/product_bidding_ca" +
      "tegory_level.proto\032Cgoogle/ads/googleads" +
      "/v5/enums/product_bidding_category_statu" +
      "s.proto\032\037google/api/field_behavior.proto" +
      "\032\031google/api/resource.proto\032\036google/prot" +
      "obuf/wrappers.proto\032\034google/api/annotati" +
      "ons.proto\"\315\006\n\036ProductBiddingCategoryCons" +
      "tant\022V\n\rresource_name\030\001 \001(\tB?\340A\003\372A9\n7goo" +
      "gleads.googleapis.com/ProductBiddingCate" +
      "goryConstant\022,\n\002id\030\002 \001(\0132\033.google.protob" +
      "uf.Int64ValueB\003\340A\003\0227\n\014country_code\030\003 \001(\013" +
      "2\034.google.protobuf.StringValueB\003\340A\003\022\217\001\n(" +
      "product_bidding_category_constant_parent" +
      "\030\004 \001(\0132\034.google.protobuf.StringValueB?\340A" +
      "\003\372A9\n7googleads.googleapis.com/ProductBi" +
      "ddingCategoryConstant\022n\n\005level\030\005 \001(\0162Z.g" +
      "oogle.ads.googleads.v5.enums.ProductBidd" +
      "ingCategoryLevelEnum.ProductBiddingCateg" +
      "oryLevelB\003\340A\003\022q\n\006status\030\006 \001(\0162\\.google.a" +
      "ds.googleads.v5.enums.ProductBiddingCate" +
      "goryStatusEnum.ProductBiddingCategorySta" +
      "tusB\003\340A\003\0228\n\rlanguage_code\030\007 \001(\0132\034.google" +
      ".protobuf.StringValueB\003\340A\003\0229\n\016localized_" +
      "name\030\010 \001(\0132\034.google.protobuf.StringValue" +
      "B\003\340A\003:\201\001\352A~\n7googleads.googleapis.com/Pr" +
      "oductBiddingCategoryConstant\022CproductBid" +
      "dingCategoryConstants/{product_bidding_c" +
      "ategory_constant}B\220\002\n%com.google.ads.goo" +
      "gleads.v5.resourcesB#ProductBiddingCateg" +
      "oryConstantProtoP\001ZJgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v5/resou" +
      "rces;resources\242\002\003GAA\252\002!Google.Ads.Google" +
      "Ads.V5.Resources\312\002!Google\\Ads\\GoogleAds\\" +
      "V5\\Resources\352\002%Google::Ads::GoogleAds::V" +
      "5::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.enums.ProductBiddingCategoryLevelProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ProductBiddingCategoryStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_ProductBiddingCategoryConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_ProductBiddingCategoryConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_ProductBiddingCategoryConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "CountryCode", "ProductBiddingCategoryConstantParent", "Level", "Status", "LanguageCode", "LocalizedName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.enums.ProductBiddingCategoryLevelProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ProductBiddingCategoryStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
