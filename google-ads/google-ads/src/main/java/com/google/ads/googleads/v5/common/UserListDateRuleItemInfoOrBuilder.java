// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/common/user_lists.proto

package com.google.ads.googleads.v5.common;

public interface UserListDateRuleItemInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.common.UserListDateRuleItemInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Date comparison operator.
   * This field is required and must be populated when creating new date
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator operator = 1;</code>
   * @return The enum numeric value on the wire for operator.
   */
  int getOperatorValue();
  /**
   * <pre>
   * Date comparison operator.
   * This field is required and must be populated when creating new date
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator operator = 1;</code>
   * @return The operator.
   */
  com.google.ads.googleads.v5.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator getOperator();

  /**
   * <pre>
   * String representing date value to be compared with the rule variable.
   * Supported date format is YYYY-MM-DD.
   * Times are reported in the customer's time zone.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 2;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * String representing date value to be compared with the rule variable.
   * Supported date format is YYYY-MM-DD.
   * Times are reported in the customer's time zone.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 2;</code>
   * @return The value.
   */
  com.google.protobuf.StringValue getValue();
  /**
   * <pre>
   * String representing date value to be compared with the rule variable.
   * Supported date format is YYYY-MM-DD.
   * Times are reported in the customer's time zone.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getValueOrBuilder();

  /**
   * <pre>
   * The relative date value of the right hand side denoted by number of days
   * offset from now. The value field will override this field when both are
   * present.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value offset_in_days = 3;</code>
   * @return Whether the offsetInDays field is set.
   */
  boolean hasOffsetInDays();
  /**
   * <pre>
   * The relative date value of the right hand side denoted by number of days
   * offset from now. The value field will override this field when both are
   * present.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value offset_in_days = 3;</code>
   * @return The offsetInDays.
   */
  com.google.protobuf.Int64Value getOffsetInDays();
  /**
   * <pre>
   * The relative date value of the right hand side denoted by number of days
   * offset from now. The value field will override this field when both are
   * present.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value offset_in_days = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getOffsetInDaysOrBuilder();
}
