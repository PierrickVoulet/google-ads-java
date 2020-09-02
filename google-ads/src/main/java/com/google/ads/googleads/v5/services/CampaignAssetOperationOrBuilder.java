// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/campaign_asset_service.proto

package com.google.ads.googleads.v5.services;

public interface CampaignAssetOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.services.CampaignAssetOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign
   * asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.resources.CampaignAsset create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign
   * asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.resources.CampaignAsset create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v5.resources.CampaignAsset getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign
   * asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.resources.CampaignAsset create = 1;</code>
   */
  com.google.ads.googleads.v5.resources.CampaignAssetOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed campaign asset is
   * expected, in this format:
   * `customers/{customer_id}/campaignAssets/{campaign_id}~{asset_id}~{field_type}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed campaign asset is
   * expected, in this format:
   * `customers/{customer_id}/campaignAssets/{campaign_id}~{asset_id}~{field_type}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v5.services.CampaignAssetOperation.OperationCase getOperationCase();
}
