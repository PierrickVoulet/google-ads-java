// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/campaign_experiment.proto

package com.google.ads.googleads.v5.resources;

public interface CampaignExperimentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.resources.CampaignExperiment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the campaign experiment.
   * Campaign experiment resource names have the form:
   * `customers/{customer_id}/campaignExperiments/{campaign_experiment_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the campaign experiment.
   * Campaign experiment resource names have the form:
   * `customers/{customer_id}/campaignExperiments/{campaign_experiment_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the campaign experiment.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the campaign experiment.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the campaign experiment.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Immutable. The campaign draft with staged changes to the base campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign_draft = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaignDraft field is set.
   */
  boolean hasCampaignDraft();
  /**
   * <pre>
   * Immutable. The campaign draft with staged changes to the base campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign_draft = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaignDraft.
   */
  com.google.protobuf.StringValue getCampaignDraft();
  /**
   * <pre>
   * Immutable. The campaign draft with staged changes to the base campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign_draft = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignDraftOrBuilder();

  /**
   * <pre>
   * The name of the campaign experiment.
   * This field is required when creating new campaign experiments
   * and must not conflict with the name of another non-removed
   * campaign experiment or campaign.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the campaign experiment.
   * This field is required when creating new campaign experiments
   * and must not conflict with the name of another non-removed
   * campaign experiment or campaign.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the campaign experiment.
   * This field is required when creating new campaign experiments
   * and must not conflict with the name of another non-removed
   * campaign experiment or campaign.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The description of the experiment.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 5;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * The description of the experiment.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 5;</code>
   * @return The description.
   */
  com.google.protobuf.StringValue getDescription();
  /**
   * <pre>
   * The description of the experiment.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * Immutable. Share of traffic directed to experiment as a percent (must be between 1 and
   * 99 inclusive. Base campaign receives the remainder of the traffic
   * (100 - traffic_split_percent). Required for create.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value traffic_split_percent = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the trafficSplitPercent field is set.
   */
  boolean hasTrafficSplitPercent();
  /**
   * <pre>
   * Immutable. Share of traffic directed to experiment as a percent (must be between 1 and
   * 99 inclusive. Base campaign receives the remainder of the traffic
   * (100 - traffic_split_percent). Required for create.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value traffic_split_percent = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The trafficSplitPercent.
   */
  com.google.protobuf.Int64Value getTrafficSplitPercent();
  /**
   * <pre>
   * Immutable. Share of traffic directed to experiment as a percent (must be between 1 and
   * 99 inclusive. Base campaign receives the remainder of the traffic
   * (100 - traffic_split_percent). Required for create.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value traffic_split_percent = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTrafficSplitPercentOrBuilder();

  /**
   * <pre>
   * Immutable. Determines the behavior of the traffic split.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.CampaignExperimentTrafficSplitTypeEnum.CampaignExperimentTrafficSplitType traffic_split_type = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for trafficSplitType.
   */
  int getTrafficSplitTypeValue();
  /**
   * <pre>
   * Immutable. Determines the behavior of the traffic split.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.CampaignExperimentTrafficSplitTypeEnum.CampaignExperimentTrafficSplitType traffic_split_type = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The trafficSplitType.
   */
  com.google.ads.googleads.v5.enums.CampaignExperimentTrafficSplitTypeEnum.CampaignExperimentTrafficSplitType getTrafficSplitType();

  /**
   * <pre>
   * Output only. The experiment campaign, as opposed to the base campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue experiment_campaign = 8 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the experimentCampaign field is set.
   */
  boolean hasExperimentCampaign();
  /**
   * <pre>
   * Output only. The experiment campaign, as opposed to the base campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue experiment_campaign = 8 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The experimentCampaign.
   */
  com.google.protobuf.StringValue getExperimentCampaign();
  /**
   * <pre>
   * Output only. The experiment campaign, as opposed to the base campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue experiment_campaign = 8 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getExperimentCampaignOrBuilder();

  /**
   * <pre>
   * Output only. The status of the campaign experiment. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.CampaignExperimentStatusEnum.CampaignExperimentStatus status = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the campaign experiment. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.CampaignExperimentStatusEnum.CampaignExperimentStatus status = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v5.enums.CampaignExperimentStatusEnum.CampaignExperimentStatus getStatus();

  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be used to poll
   * for completion of experiment create or promote. The most recent long
   * running operation is returned.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_running_operation = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the longRunningOperation field is set.
   */
  boolean hasLongRunningOperation();
  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be used to poll
   * for completion of experiment create or promote. The most recent long
   * running operation is returned.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_running_operation = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The longRunningOperation.
   */
  com.google.protobuf.StringValue getLongRunningOperation();
  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be used to poll
   * for completion of experiment create or promote. The most recent long
   * running operation is returned.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_running_operation = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getLongRunningOperationOrBuilder();

  /**
   * <pre>
   * Date when the campaign experiment starts. By default, the experiment starts
   * now or on the campaign's start date, whichever is later. If this field is
   * set, then the experiment starts at the beginning of the specified date in
   * the customer's time zone. Cannot be changed once the experiment starts.
   * Format: YYYY-MM-DD
   * Example: 2019-03-14
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date = 11;</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <pre>
   * Date when the campaign experiment starts. By default, the experiment starts
   * now or on the campaign's start date, whichever is later. If this field is
   * set, then the experiment starts at the beginning of the specified date in
   * the customer's time zone. Cannot be changed once the experiment starts.
   * Format: YYYY-MM-DD
   * Example: 2019-03-14
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date = 11;</code>
   * @return The startDate.
   */
  com.google.protobuf.StringValue getStartDate();
  /**
   * <pre>
   * Date when the campaign experiment starts. By default, the experiment starts
   * now or on the campaign's start date, whichever is later. If this field is
   * set, then the experiment starts at the beginning of the specified date in
   * the customer's time zone. Cannot be changed once the experiment starts.
   * Format: YYYY-MM-DD
   * Example: 2019-03-14
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date = 11;</code>
   */
  com.google.protobuf.StringValueOrBuilder getStartDateOrBuilder();

  /**
   * <pre>
   * Date when the campaign experiment ends. By default, the experiment ends on
   * the campaign's end date. If this field is set, then the experiment ends at
   * the end of the specified date in the customer's time zone.
   * Format: YYYY-MM-DD
   * Example: 2019-04-18
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date = 12;</code>
   * @return Whether the endDate field is set.
   */
  boolean hasEndDate();
  /**
   * <pre>
   * Date when the campaign experiment ends. By default, the experiment ends on
   * the campaign's end date. If this field is set, then the experiment ends at
   * the end of the specified date in the customer's time zone.
   * Format: YYYY-MM-DD
   * Example: 2019-04-18
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date = 12;</code>
   * @return The endDate.
   */
  com.google.protobuf.StringValue getEndDate();
  /**
   * <pre>
   * Date when the campaign experiment ends. By default, the experiment ends on
   * the campaign's end date. If this field is set, then the experiment ends at
   * the end of the specified date in the customer's time zone.
   * Format: YYYY-MM-DD
   * Example: 2019-04-18
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date = 12;</code>
   */
  com.google.protobuf.StringValueOrBuilder getEndDateOrBuilder();
}
