// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/campaign_draft.proto

package com.google.ads.googleads.v1.resources;

public interface CampaignDraftOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.CampaignDraft)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the campaign draft.
   * Campaign draft resource names have the form:
   * `customers/{customer_id}/campaignDrafts/{base_campaign_id}~{draft_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the campaign draft.
   * Campaign draft resource names have the form:
   * `customers/{customer_id}/campaignDrafts/{base_campaign_id}~{draft_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the draft.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value draft_id = 2;</code>
   */
  boolean hasDraftId();
  /**
   * <pre>
   * The ID of the draft.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value draft_id = 2;</code>
   */
  com.google.protobuf.Int64Value getDraftId();
  /**
   * <pre>
   * The ID of the draft.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value draft_id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getDraftIdOrBuilder();

  /**
   * <pre>
   * The base campaign to which the draft belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_campaign = 3;</code>
   */
  boolean hasBaseCampaign();
  /**
   * <pre>
   * The base campaign to which the draft belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_campaign = 3;</code>
   */
  com.google.protobuf.StringValue getBaseCampaign();
  /**
   * <pre>
   * The base campaign to which the draft belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_campaign = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getBaseCampaignOrBuilder();

  /**
   * <pre>
   * The name of the campaign draft.
   * This field is required and should not be empty when creating new
   * campaign drafts.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the campaign draft.
   * This field is required and should not be empty when creating new
   * campaign drafts.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the campaign draft.
   * This field is required and should not be empty when creating new
   * campaign drafts.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Resource name of the Campaign that results from overlaying the draft
   * changes onto the base campaign.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue draft_campaign = 5;</code>
   */
  boolean hasDraftCampaign();
  /**
   * <pre>
   * Resource name of the Campaign that results from overlaying the draft
   * changes onto the base campaign.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue draft_campaign = 5;</code>
   */
  com.google.protobuf.StringValue getDraftCampaign();
  /**
   * <pre>
   * Resource name of the Campaign that results from overlaying the draft
   * changes onto the base campaign.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue draft_campaign = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDraftCampaignOrBuilder();

  /**
   * <pre>
   * The status of the campaign draft. This field is read-only.
   * When a new campaign draft is added, the status defaults to PROPOSED.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.CampaignDraftStatusEnum.CampaignDraftStatus status = 6;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the campaign draft. This field is read-only.
   * When a new campaign draft is added, the status defaults to PROPOSED.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.CampaignDraftStatusEnum.CampaignDraftStatus status = 6;</code>
   */
  com.google.ads.googleads.v1.enums.CampaignDraftStatusEnum.CampaignDraftStatus getStatus();

  /**
   * <pre>
   * Whether there is an experiment based on this draft currently serving.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_experiment_running = 7;</code>
   */
  boolean hasHasExperimentRunning();
  /**
   * <pre>
   * Whether there is an experiment based on this draft currently serving.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_experiment_running = 7;</code>
   */
  com.google.protobuf.BoolValue getHasExperimentRunning();
  /**
   * <pre>
   * Whether there is an experiment based on this draft currently serving.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_experiment_running = 7;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHasExperimentRunningOrBuilder();

  /**
   * <pre>
   * The resource name of the long-running operation that can be used to poll
   * for completion of draft promotion. This is only set if the draft promotion
   * is in progress or finished.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_running_operation = 8;</code>
   */
  boolean hasLongRunningOperation();
  /**
   * <pre>
   * The resource name of the long-running operation that can be used to poll
   * for completion of draft promotion. This is only set if the draft promotion
   * is in progress or finished.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_running_operation = 8;</code>
   */
  com.google.protobuf.StringValue getLongRunningOperation();
  /**
   * <pre>
   * The resource name of the long-running operation that can be used to poll
   * for completion of draft promotion. This is only set if the draft promotion
   * is in progress or finished.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_running_operation = 8;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLongRunningOperationOrBuilder();
}