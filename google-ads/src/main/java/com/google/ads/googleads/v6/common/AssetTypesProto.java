// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/common/asset_types.proto

package com.google.ads.googleads.v6.common;

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
    internal_static_google_ads_googleads_v6_common_YoutubeVideoAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_common_YoutubeVideoAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_common_MediaBundleAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_common_MediaBundleAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_common_ImageAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_common_ImageAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_common_ImageDimension_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_common_ImageDimension_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_common_TextAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_common_TextAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_common_LeadFormAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_common_LeadFormAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_common_LeadFormField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_common_LeadFormField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_common_LeadFormSingleChoiceAnswers_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_common_LeadFormSingleChoiceAnswers_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_common_LeadFormDeliveryMethod_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_common_LeadFormDeliveryMethod_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_common_WebhookDelivery_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_common_WebhookDelivery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_common_BookOnGoogleAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_common_BookOnGoogleAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v6/common/asset_t" +
      "ypes.proto\022\036google.ads.googleads.v6.comm" +
      "on\032Agoogle/ads/googleads/v6/enums/lead_f" +
      "orm_call_to_action_type.proto\032<google/ad" +
      "s/googleads/v6/enums/lead_form_desired_i" +
      "ntent.proto\032Cgoogle/ads/googleads/v6/enu" +
      "ms/lead_form_field_user_input_type.proto" +
      "\032Mgoogle/ads/googleads/v6/enums/lead_for" +
      "m_post_submit_call_to_action_type.proto\032" +
      "-google/ads/googleads/v6/enums/mime_type" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\034google/api/annotations.proto\"G\n\021Youtube" +
      "VideoAsset\022\035\n\020youtube_video_id\030\002 \001(\tH\000\210\001" +
      "\001B\023\n\021_youtube_video_id\".\n\020MediaBundleAss" +
      "et\022\021\n\004data\030\002 \001(\014H\000\210\001\001B\007\n\005_data\"\332\001\n\nImage" +
      "Asset\022\021\n\004data\030\005 \001(\014H\000\210\001\001\022\026\n\tfile_size\030\006 " +
      "\001(\003H\001\210\001\001\022G\n\tmime_type\030\003 \001(\01624.google.ads" +
      ".googleads.v6.enums.MimeTypeEnum.MimeTyp" +
      "e\022A\n\tfull_size\030\004 \001(\0132..google.ads.google" +
      "ads.v6.common.ImageDimensionB\007\n\005_dataB\014\n" +
      "\n_file_size\"\204\001\n\016ImageDimension\022\032\n\rheight" +
      "_pixels\030\004 \001(\003H\000\210\001\001\022\031\n\014width_pixels\030\005 \001(\003" +
      "H\001\210\001\001\022\020\n\003url\030\006 \001(\tH\002\210\001\001B\020\n\016_height_pixel" +
      "sB\017\n\r_width_pixelsB\006\n\004_url\"\'\n\tTextAsset\022" +
      "\021\n\004text\030\002 \001(\tH\000\210\001\001B\007\n\005_text\"\237\007\n\rLeadForm" +
      "Asset\022\032\n\rbusiness_name\030\n \001(\tB\003\340A\002\022v\n\023cal" +
      "l_to_action_type\030\021 \001(\0162T.google.ads.goog" +
      "leads.v6.enums.LeadFormCallToActionTypeE" +
      "num.LeadFormCallToActionTypeB\003\340A\002\022\'\n\032cal" +
      "l_to_action_description\030\022 \001(\tB\003\340A\002\022\025\n\010he" +
      "adline\030\014 \001(\tB\003\340A\002\022\030\n\013description\030\r \001(\tB\003" +
      "\340A\002\022\037\n\022privacy_policy_url\030\016 \001(\tB\003\340A\002\022!\n\024" +
      "post_submit_headline\030\017 \001(\tH\000\210\001\001\022$\n\027post_" +
      "submit_description\030\020 \001(\tH\001\210\001\001\022=\n\006fields\030" +
      "\010 \003(\0132-.google.ads.googleads.v6.common.L" +
      "eadFormField\022P\n\020delivery_methods\030\t \003(\01326" +
      ".google.ads.googleads.v6.common.LeadForm" +
      "DeliveryMethod\022\221\001\n\037post_submit_call_to_a" +
      "ction_type\030\023 \001(\0162h.google.ads.googleads." +
      "v6.enums.LeadFormPostSubmitCallToActionT" +
      "ypeEnum.LeadFormPostSubmitCallToActionTy" +
      "pe\022#\n\026background_image_asset\030\024 \001(\tH\002\210\001\001\022" +
      "f\n\016desired_intent\030\025 \001(\0162N.google.ads.goo" +
      "gleads.v6.enums.LeadFormDesiredIntentEnu" +
      "m.LeadFormDesiredIntent\022\036\n\021custom_disclo" +
      "sure\030\026 \001(\tH\003\210\001\001B\027\n\025_post_submit_headline" +
      "B\032\n\030_post_submit_descriptionB\031\n\027_backgro" +
      "und_image_assetB\024\n\022_custom_disclosure\"\346\001" +
      "\n\rLeadFormField\022l\n\ninput_type\030\001 \001(\0162X.go" +
      "ogle.ads.googleads.v6.enums.LeadFormFiel" +
      "dUserInputTypeEnum.LeadFormFieldUserInpu" +
      "tType\022\\\n\025single_choice_answers\030\002 \001(\0132;.g" +
      "oogle.ads.googleads.v6.common.LeadFormSi" +
      "ngleChoiceAnswersH\000B\t\n\007answers\".\n\033LeadFo" +
      "rmSingleChoiceAnswers\022\017\n\007answers\030\001 \003(\t\"p" +
      "\n\026LeadFormDeliveryMethod\022B\n\007webhook\030\001 \001(" +
      "\0132/.google.ads.googleads.v6.common.Webho" +
      "okDeliveryH\000B\022\n\020delivery_details\"\277\001\n\017Web" +
      "hookDelivery\022#\n\026advertiser_webhook_url\030\004" +
      " \001(\tH\000\210\001\001\022\032\n\rgoogle_secret\030\005 \001(\tH\001\210\001\001\022#\n" +
      "\026payload_schema_version\030\006 \001(\003H\002\210\001\001B\031\n\027_a" +
      "dvertiser_webhook_urlB\020\n\016_google_secretB" +
      "\031\n\027_payload_schema_version\"\023\n\021BookOnGoog" +
      "leAssetB\352\001\n\"com.google.ads.googleads.v6." +
      "commonB\017AssetTypesProtoP\001ZDgoogle.golang" +
      ".org/genproto/googleapis/ads/googleads/v" +
      "6/common;common\242\002\003GAA\252\002\036Google.Ads.Googl" +
      "eAds.V6.Common\312\002\036Google\\Ads\\GoogleAds\\V6" +
      "\\Common\352\002\"Google::Ads::GoogleAds::V6::Co" +
      "mmonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.enums.LeadFormCallToActionTypeProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.LeadFormDesiredIntentProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.LeadFormFieldUserInputTypeProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.LeadFormPostSubmitCallToActionTypeProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.MimeTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_common_YoutubeVideoAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_common_YoutubeVideoAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_common_YoutubeVideoAsset_descriptor,
        new java.lang.String[] { "YoutubeVideoId", "YoutubeVideoId", });
    internal_static_google_ads_googleads_v6_common_MediaBundleAsset_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_common_MediaBundleAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_common_MediaBundleAsset_descriptor,
        new java.lang.String[] { "Data", "Data", });
    internal_static_google_ads_googleads_v6_common_ImageAsset_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_common_ImageAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_common_ImageAsset_descriptor,
        new java.lang.String[] { "Data", "FileSize", "MimeType", "FullSize", "Data", "FileSize", });
    internal_static_google_ads_googleads_v6_common_ImageDimension_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_common_ImageDimension_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_common_ImageDimension_descriptor,
        new java.lang.String[] { "HeightPixels", "WidthPixels", "Url", "HeightPixels", "WidthPixels", "Url", });
    internal_static_google_ads_googleads_v6_common_TextAsset_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_common_TextAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_common_TextAsset_descriptor,
        new java.lang.String[] { "Text", "Text", });
    internal_static_google_ads_googleads_v6_common_LeadFormAsset_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v6_common_LeadFormAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_common_LeadFormAsset_descriptor,
        new java.lang.String[] { "BusinessName", "CallToActionType", "CallToActionDescription", "Headline", "Description", "PrivacyPolicyUrl", "PostSubmitHeadline", "PostSubmitDescription", "Fields", "DeliveryMethods", "PostSubmitCallToActionType", "BackgroundImageAsset", "DesiredIntent", "CustomDisclosure", "PostSubmitHeadline", "PostSubmitDescription", "BackgroundImageAsset", "CustomDisclosure", });
    internal_static_google_ads_googleads_v6_common_LeadFormField_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v6_common_LeadFormField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_common_LeadFormField_descriptor,
        new java.lang.String[] { "InputType", "SingleChoiceAnswers", "Answers", });
    internal_static_google_ads_googleads_v6_common_LeadFormSingleChoiceAnswers_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v6_common_LeadFormSingleChoiceAnswers_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_common_LeadFormSingleChoiceAnswers_descriptor,
        new java.lang.String[] { "Answers", });
    internal_static_google_ads_googleads_v6_common_LeadFormDeliveryMethod_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v6_common_LeadFormDeliveryMethod_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_common_LeadFormDeliveryMethod_descriptor,
        new java.lang.String[] { "Webhook", "DeliveryDetails", });
    internal_static_google_ads_googleads_v6_common_WebhookDelivery_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v6_common_WebhookDelivery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_common_WebhookDelivery_descriptor,
        new java.lang.String[] { "AdvertiserWebhookUrl", "GoogleSecret", "PayloadSchemaVersion", "AdvertiserWebhookUrl", "GoogleSecret", "PayloadSchemaVersion", });
    internal_static_google_ads_googleads_v6_common_BookOnGoogleAsset_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v6_common_BookOnGoogleAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_common_BookOnGoogleAsset_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.enums.LeadFormCallToActionTypeProto.getDescriptor();
    com.google.ads.googleads.v6.enums.LeadFormDesiredIntentProto.getDescriptor();
    com.google.ads.googleads.v6.enums.LeadFormFieldUserInputTypeProto.getDescriptor();
    com.google.ads.googleads.v6.enums.LeadFormPostSubmitCallToActionTypeProto.getDescriptor();
    com.google.ads.googleads.v6.enums.MimeTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
