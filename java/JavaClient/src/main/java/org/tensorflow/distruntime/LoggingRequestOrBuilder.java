// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

public interface LoggingRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.LoggingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If true, RPC logging will be enabled.
   * </pre>
   *
   * <code>bool enable_rpc_logging = 1;</code>
   * @return The enableRpcLogging.
   */
  boolean getEnableRpcLogging();

  /**
   * <pre>
   * If true, RPC logging will be disabled.
   * </pre>
   *
   * <code>bool disable_rpc_logging = 4;</code>
   * @return The disableRpcLogging.
   */
  boolean getDisableRpcLogging();

  /**
   * <pre>
   * If true, discard any saved logging data (for all steps).
   * </pre>
   *
   * <code>bool clear = 2;</code>
   * @return The clear.
   */
  boolean getClear();

  /**
   * <pre>
   * When set, requests all saved log data pertaining to the step.
   * Any log data retrieved is eliminated from the store and cannot be
   * retrieved again.
   * </pre>
   *
   * <code>repeated int64 fetch_step_id = 3;</code>
   * @return A list containing the fetchStepId.
   */
  java.util.List<java.lang.Long> getFetchStepIdList();
  /**
   * <pre>
   * When set, requests all saved log data pertaining to the step.
   * Any log data retrieved is eliminated from the store and cannot be
   * retrieved again.
   * </pre>
   *
   * <code>repeated int64 fetch_step_id = 3;</code>
   * @return The count of fetchStepId.
   */
  int getFetchStepIdCount();
  /**
   * <pre>
   * When set, requests all saved log data pertaining to the step.
   * Any log data retrieved is eliminated from the store and cannot be
   * retrieved again.
   * </pre>
   *
   * <code>repeated int64 fetch_step_id = 3;</code>
   * @param index The index of the element to return.
   * @return The fetchStepId at the given index.
   */
  long getFetchStepId(int index);
}