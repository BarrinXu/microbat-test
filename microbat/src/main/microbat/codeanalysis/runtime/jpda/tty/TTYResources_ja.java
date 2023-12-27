/*
 * Copyright (c) 2001, 2014, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

/*
 * This source code is provided to illustrate the usage of a given feature
 * or technique and has been deliberately simplified. Additional steps
 * required for a production-quality application, such as security checks,
 * input validation and proper error handling, might not be present in
 * this sample code.
 */

package microbat.codeanalysis.runtime.jpda.tty;

/**
 * This class represents the <code>ResourceBundle</code> for the following package(s):
 *
 * <ol>
 *   <li>microbat.codeanalysis.runtime.jpda.tty
 * </ol>
 */
public class TTYResources_ja extends java.util.ListResourceBundle {

  /**
   * Returns the contents of this <code>ResourceBundle</code>.
   *
   * <p>
   *
   * @return the contents of this <code>ResourceBundle</code>.
   */
  @Override
  public Object[][] getContents() {
    Object[][] temp =
        new Object[][] {
          // NOTE: The value strings in this file containing "{0}" are
          //       processed by the java.text.MessageFormat class.  Any
          //       single quotes appearing in these strings need to be
          //       doubled up.
          //
          // LOCALIZE THIS
          {"** classes list **", "** \u30AF\u30E9\u30B9\u30FB\u30EA\u30B9\u30C8 **\n{0}"},
          {
            "** fields list **", "** \u30D5\u30A3\u30FC\u30EB\u30C9\u30FB\u30EA\u30B9\u30C8 **\n{0}"
          },
          {"** methods list **", "** \u30E1\u30BD\u30C3\u30C9\u30FB\u30EA\u30B9\u30C8 **\n{0}"},
          {
            "*** Reading commands from",
            "*** {0}\u304B\u3089\u306E\u30B3\u30DE\u30F3\u30C9\u306E\u8AAD\u53D6\u308A"
          },
          {
            "All threads resumed.",
            "\u3059\u3079\u3066\u306E\u30B9\u30EC\u30C3\u30C9\u304C\u518D\u958B\u3055\u308C\u307E\u3057\u305F\u3002"
          },
          {
            "All threads suspended.",
            "\u3059\u3079\u3066\u306E\u30B9\u30EC\u30C3\u30C9\u304C\u4E2D\u65AD\u3055\u308C\u307E\u3057\u305F\u3002"
          },
          {
            "Argument is not defined for connector:",
            "\u5F15\u6570{0}\u306F\u30B3\u30CD\u30AF\u30BF\u306B\u5BFE\u3057\u3066\u5B9A\u7FA9\u3055\u308C\u3066\u3044\u307E\u305B\u3093:"
                + " {1}"
          },
          {
            "Arguments match no method",
            "\u5F15\u6570\u304C\u9069\u5408\u3059\u308B\u30E1\u30BD\u30C3\u30C9\u304C\u3042\u308A\u307E\u305B\u3093"
          },
          {"Array:", "\u914D\u5217: {0}"},
          {
            "Array element is not a method",
            "\u914D\u5217\u8981\u7D20\u306F\u30E1\u30BD\u30C3\u30C9\u3067\u306F\u3042\u308A\u307E\u305B\u3093"
          },
          {
            "Array index must be a integer type",
            "\u914D\u5217\u306E\u6DFB\u3048\u5B57\u306F\u6574\u6570\u578B\u3067\u3042\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059"
          },
          {"base directory:", "\u30D9\u30FC\u30B9\u30FB\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA: {0}"},
          {"bootclasspath:", "\u30D6\u30FC\u30C8\u30FB\u30AF\u30E9\u30B9\u30D1\u30B9: {0}"},
          {
            "Breakpoint hit:",
            "\u30D2\u30C3\u30C8\u3057\u305F\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8: "
          },
          {"breakpoint", "\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8{0}"},
          {
            "Breakpoints set:",
            "\u8A2D\u5B9A\u3055\u308C\u3066\u3044\u308B\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8:"
          },
          {
            "Breakpoints can be located only in classes.",
            "\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8\u306F\u30AF\u30E9\u30B9\u5185\u306B\u306E\u307F\u914D\u7F6E\u3067\u304D\u307E\u3059\u3002{0}\u306F\u30A4\u30F3\u30BF\u30D5\u30A7\u30FC\u30B9\u307E\u305F\u306F\u914D\u5217\u3067\u3059\u3002"
          },
          {
            "Can only trace",
            "'methods'\u3001'method exit'\u307E\u305F\u306F'method"
                + " exits'\u306E\u307F\u30C8\u30EC\u30FC\u30B9\u3067\u304D\u307E\u3059"
          },
          {
            "cannot redefine existing connection",
            "{0}\u306F\u65E2\u5B58\u306E\u63A5\u7D9A\u3092\u518D\u5B9A\u7FA9\u3067\u304D\u307E\u305B\u3093"
          },
          {
            "Cannot assign to a method invocation",
            "\u30E1\u30BD\u30C3\u30C9\u547C\u51FA\u3057\u306B\u5272\u5F53\u3066\u3067\u304D\u307E\u305B\u3093"
          },
          {
            "Cannot specify command line with connector:",
            "\u30B3\u30CD\u30AF\u30BF\u3067\u30B3\u30DE\u30F3\u30C9\u884C\u3092\u6307\u5B9A\u3067\u304D\u307E\u305B\u3093:"
                + " {0}"
          },
          {
            "Cannot specify target vm arguments with connector:",
            "\u30B3\u30CD\u30AF\u30BF\u3067\u30BF\u30FC\u30B2\u30C3\u30C8VM\u5F15\u6570\u3092\u6307\u5B9A\u3067\u304D\u307E\u305B\u3093:"
                + " {0}"
          },
          {
            "Class containing field must be specified.",
            "\u30D5\u30A3\u30FC\u30EB\u30C9\u3092\u542B\u3080\u30AF\u30E9\u30B9\u3092\u6307\u5B9A\u3059\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059\u3002"
          },
          {"Class:", "\u30AF\u30E9\u30B9: {0}"},
          {
            "Classic VM no longer supported.",
            "Classic"
                + " VM\u306F\u73FE\u5728\u30B5\u30DD\u30FC\u30C8\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {"classpath:", "\u30AF\u30E9\u30B9\u30D1\u30B9: {0}"},
          {"colon mark", ":"},
          {"colon space", ": "},
          {
            "Command is not supported on the target VM",
            "\u30B3\u30DE\u30F3\u30C9''{0}''\u306F\u30BF\u30FC\u30B2\u30C3\u30C8VM\u3067\u306F\u30B5\u30DD\u30FC\u30C8\u3055\u308C\u3066\u3044\u307E\u305B\u3093"
          },
          {
            "Command is not supported on a read-only VM connection",
            "\u30B3\u30DE\u30F3\u30C9''{0}''\u306F\u8AAD\u53D6\u308A\u5C02\u7528VM\u63A5\u7D9A\u3067\u306F\u30B5\u30DD\u30FC\u30C8\u3055\u308C\u3066\u3044\u307E\u305B\u3093"
          },
          {
            "Command not valid until the VM is started with the run command",
            "\u30B3\u30DE\u30F3\u30C9''{0}''\u306F\u3001VM\u304C''run''\u30B3\u30DE\u30F3\u30C9\u3067\u958B\u59CB\u3055\u308C\u308B\u307E\u3067\u7121\u52B9\u3067\u3059"
          },
          {
            "Condition must be boolean",
            "\u6761\u4EF6\u306Fboolean\u3067\u3042\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059"
          },
          {
            "Connector and Transport name",
            "  \u30B3\u30CD\u30AF\u30BF: {0}  \u30C8\u30E9\u30F3\u30B9\u30DD\u30FC\u30C8: {1}"
          },
          {
            "Connector argument nodefault",
            "    \u5F15\u6570: {0} (\u30C7\u30D5\u30A9\u30EB\u30C8\u306A\u3057)"
          },
          {
            "Connector argument default",
            "    \u5F15\u6570: {0} \u30C7\u30D5\u30A9\u30EB\u30C8\u5024: {1}"
          },
          {"Connector description", "    \u8AAC\u660E: {0}"},
          {
            "Connector required argument nodefault",
            "    \u5FC5\u9808\u5F15\u6570: {0} (\u30C7\u30D5\u30A9\u30EB\u30C8\u306A\u3057)"
          },
          {
            "Connector required argument default",
            "    \u5FC5\u9808\u5F15\u6570: {0} \u30C7\u30D5\u30A9\u30EB\u30C8\u5024: {1}"
          },
          {"Connectors available", "\u5229\u7528\u53EF\u80FD\u306A\u30B3\u30CD\u30AF\u30BF:"},
          {
            "Constant is not a method",
            "\u5B9A\u6570\u306F\u30E1\u30BD\u30C3\u30C9\u3067\u306F\u3042\u308A\u307E\u305B\u3093"
          },
          {"Could not open:", "\u958B\u3051\u307E\u305B\u3093\u3067\u3057\u305F: {0}"},
          {
            "Current method is native",
            "\u73FE\u5728\u306E\u30E1\u30BD\u30C3\u30C9\u306Fnative\u3067\u3059"
          },
          {
            "Current thread died. Execution continuing...",
            "\u73FE\u5728\u306E\u30B9\u30EC\u30C3\u30C9{0}\u304C\u7D42\u4E86\u3057\u307E\u3057\u305F\u3002\u5B9F\u884C\u304C\u7D9A\u884C\u4E2D..."
          },
          {
            "Current thread isnt suspended.",
            "\u73FE\u5728\u306E\u30B9\u30EC\u30C3\u30C9\u306F\u4E2D\u65AD\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "Current thread not set.",
            "\u73FE\u5728\u306E\u30B9\u30EC\u30C3\u30C9\u304C\u8A2D\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "dbgtrace flag value must be an integer:",
            "dbgtrace\u30D5\u30E9\u30B0\u5024\u306F\u6574\u6570\u3067\u3042\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059:"
                + " {0}"
          },
          {
            "Deferring.",
            "\u9045\u5EF6\u3057\u305F{0}\u3002\n"
                + "\u30AF\u30E9\u30B9\u304C\u30ED\u30FC\u30C9\u3055\u308C\u305F\u5F8C\u306B\u8A2D\u5B9A\u3055\u308C\u307E\u3059\u3002"
          },
          {"End of stack.", "\u30B9\u30BF\u30C3\u30AF\u306E\u7D42\u308F\u308A\u3002"},
          {
            "Error popping frame",
            "\u30D5\u30EC\u30FC\u30E0\u306E\u30DD\u30C3\u30D7\u4E2D\u306E\u30A8\u30E9\u30FC - {0}"
          },
          {"Error reading file", "''{0}''\u306E\u8AAD\u53D6\u308A\u30A8\u30E9\u30FC - {1}"},
          {
            "Error redefining class to file",
            "{0}\u3092{1}\u306B\u518D\u5B9A\u7FA9\u4E2D\u306E\u30A8\u30E9\u30FC - {2}"
          },
          {"exceptionSpec all", "\u3059\u3079\u3066\u306E{0}"},
          {"exceptionSpec caught", "\u6355\u6349\u3057\u305F{0}"},
          {"exceptionSpec uncaught", "\u6355\u6349\u3055\u308C\u306A\u3044{0}"},
          {"Exception in expression:", "\u5F0F\u306E\u4F8B\u5916: {0}"},
          {
            "Exception occurred caught",
            "\u4F8B\u5916\u304C\u767A\u751F\u3057\u307E\u3057\u305F: {0}"
                + " (\u6355\u6349\u3055\u308C\u308B\u5834\u6240: {1})"
          },
          {
            "Exception occurred uncaught",
            "\u4F8B\u5916\u304C\u767A\u751F\u3057\u307E\u3057\u305F: {0}"
                + " (\u6355\u6349\u3055\u308C\u306A\u3044)"
          },
          {
            "Exceptions caught:",
            "\u6B21\u306E\u4F8B\u5916\u304C\u767A\u751F\u3057\u305F\u3068\u304D\u306B\u30D6\u30EC\u30FC\u30AF:"
          },
          {"expr is null", "{0} = null"},
          {"expr is value", "{0} = {1}"},
          {"expr is value <collected>", "  {0} = {1} <collected>"},
          {
            "Expression cannot be void",
            "\u5F0F\u306Fvoid\u578B\u306B\u3067\u304D\u307E\u305B\u3093"
          },
          {
            "Expression must evaluate to an object",
            "\u5F0F\u306F\u30AA\u30D6\u30B8\u30A7\u30AF\u30C8\u3068\u3057\u3066\u8A55\u4FA1\u3055\u308C\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059"
          },
          {"extends:", "\u62E1\u5F35\u3057\u307E\u3059: {0}"},
          {
            "Failed reading output",
            "\u5B50\u306Ejava\u30A4\u30F3\u30BF\u30FC\u30D7\u30EA\u30BF\u306E\u51FA\u529B\u306E\u8AAD\u53D6\u308A\u306B\u5931\u6557\u3057\u307E\u3057\u305F\u3002"
          },
          {"Fatal error", "\u81F4\u547D\u7684\u30A8\u30E9\u30FC:"},
          {
            "Field access encountered before after",
            "\u30D5\u30A3\u30FC\u30EB\u30C9({0})\u306F{1}\u3067\u3001{2}\u306B\u306A\u308A\u307E\u3059:"
                + " "
          },
          {
            "Field access encountered",
            "\u30D5\u30A3\u30FC\u30EB\u30C9({0})\u306E\u30A2\u30AF\u30BB\u30B9\u304C\u691C\u51FA\u3055\u308C\u307E\u3057\u305F:"
                + " "
          },
          {
            "Field to unwatch not specified",
            "\u76E3\u8996\u3057\u306A\u3044\u30D5\u30A3\u30FC\u30EB\u30C9\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "Field to watch not specified",
            "\u76E3\u8996\u3059\u308B\u30D5\u30A3\u30FC\u30EB\u30C9\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {"GC Disabled for", "{0}\u306EGC\u304C\u7121\u52B9\u3067\u3059:"},
          {"GC Enabled for", "{0}\u306EGC\u304C\u6709\u52B9\u3067\u3059:"},
          {"grouping begin character", "{"},
          {"grouping end character", "}"},
          {
            "Illegal Argument Exception",
            "\u4E0D\u6B63\u306A\u5F15\u6570\u306E\u4F8B\u5916\u3067\u3059"
          },
          {
            "Illegal connector argument",
            "\u4E0D\u6B63\u306A\u30B3\u30CD\u30AF\u30BF\u5F15\u6570\u3067\u3059: {0}"
          },
          {"implementor:", "\u30A4\u30F3\u30D7\u30EA\u30E1\u30F3\u30BF: {0}"},
          {"implements:", "\u5B9F\u88C5\u3057\u307E\u3059: {0}"},
          {"Initializing progname", "{0}\u306E\u521D\u671F\u5316\u4E2D..."},
          {
            "Input stream closed.",
            "\u5165\u529B\u30B9\u30C8\u30EA\u30FC\u30E0\u304C\u9589\u3058\u3089\u308C\u307E\u3057\u305F\u3002"
          },
          {"Interface:", "\u30A4\u30F3\u30BF\u30D5\u30A7\u30FC\u30B9: {0}"},
          {
            "Internal debugger error.",
            "\u30C7\u30D0\u30C3\u30AC\u306E\u5185\u90E8\u30A8\u30E9\u30FC\u3067\u3059\u3002"
          },
          {
            "Internal error: null ThreadInfo created",
            "\u5185\u90E8\u30A8\u30E9\u30FC:"
                + " null\u306EThreadInfo\u304C\u4F5C\u6210\u3055\u308C\u307E\u3057\u305F"
          },
          {
            "Internal error; unable to set",
            "\u5185\u90E8\u30A8\u30E9\u30FC\u3002{0}\u3092\u8A2D\u5B9A\u3067\u304D\u307E\u305B\u3093"
          },
          {
            "Internal exception during operation:",
            "\u64CD\u4F5C\u4E2D\u306E\u5185\u90E8\u4F8B\u5916:\n    {0}"
          },
          {"Internal exception:", "\u5185\u90E8\u4F8B\u5916:"},
          {
            "Invalid argument type name",
            "\u5F15\u6570\u578B\u306E\u540D\u524D\u304C\u7121\u52B9\u3067\u3059"
          },
          {
            "Invalid assignment syntax",
            "\u5272\u5F53\u3066\u69CB\u6587\u304C\u7121\u52B9\u3067\u3059"
          },
          {
            "Invalid command syntax",
            "\u30B3\u30DE\u30F3\u30C9\u69CB\u6587\u304C\u7121\u52B9\u3067\u3059"
          },
          {"Invalid connect type", "\u63A5\u7D9A\u578B\u304C\u7121\u52B9\u3067\u3059"},
          {
            "Invalid consecutive invocations",
            "\u9023\u7D9A\u547C\u51FA\u3057\u304C\u7121\u52B9\u3067\u3059"
          },
          {
            "Invalid exception object",
            "\u4F8B\u5916\u30AA\u30D6\u30B8\u30A7\u30AF\u30C8\u304C\u7121\u52B9\u3067\u3059"
          },
          {
            "Invalid method specification:",
            "\u7121\u52B9\u306A\u30E1\u30BD\u30C3\u30C9\u6307\u5B9A: {0}"
          },
          {
            "Invalid option on class command",
            "class\u30B3\u30DE\u30F3\u30C9\u306E\u30AA\u30D7\u30B7\u30E7\u30F3\u304C\u7121\u52B9\u3067\u3059"
          },
          {"invalid option", "\u7121\u52B9\u306A\u30AA\u30D7\u30B7\u30E7\u30F3: {0}"},
          {
            "Invalid thread status.",
            "\u30B9\u30EC\u30C3\u30C9\u72B6\u614B\u304C\u7121\u52B9\u3067\u3059\u3002"
          },
          {
            "Invalid transport name:",
            "\u30C8\u30E9\u30F3\u30B9\u30DD\u30FC\u30C8\u540D\u304C\u7121\u52B9\u3067\u3059: {0}"
          },
          {
            "I/O exception occurred:",
            "\u5165\u51FA\u529B\u4F8B\u5916\u304C\u767A\u751F\u3057\u307E\u3057\u305F: {0}"
          },
          {
            "is an ambiguous method name in",
            "\"{0}\"\u306F\"{1}\"\u306E\u3042\u3044\u307E\u3044\u306A\u30E1\u30BD\u30C3\u30C9\u540D\u3067\u3059"
          },
          {
            "is an invalid line number for",
            "{0,number,integer}\u306F{1}\u306E\u7121\u52B9\u306A\u884C\u756A\u53F7\u3067\u3059"
          },
          {
            "is not a valid class name",
            "\"{0}\"\u306F\u4E0D\u6B63\u306A\u30AF\u30E9\u30B9\u540D\u3067\u3059\u3002"
          },
          {
            "is not a valid field name",
            "\"{0}\"\u306F\u4E0D\u6B63\u306A\u30D5\u30A3\u30FC\u30EB\u30C9\u540D\u3067\u3059\u3002"
          },
          {
            "is not a valid id or class name",
            "\"{0}\"\u306F\u4E0D\u6B63\u306AID\u307E\u305F\u306F\u30AF\u30E9\u30B9\u540D\u3067\u3059\u3002"
          },
          {
            "is not a valid line number or method name for",
            "\"{0}\"\u306F\u30AF\u30E9\u30B9\"{1}\"\u306E\u4E0D\u6B63\u306A\u884C\u756A\u53F7\u307E\u305F\u306F\u30E1\u30BD\u30C3\u30C9\u540D\u3067\u3059"
          },
          {
            "is not a valid method name",
            "\"{0}\"\u306F\u4E0D\u6B63\u306A\u30E1\u30BD\u30C3\u30C9\u540D\u3067\u3059\u3002"
          },
          {
            "is not a valid thread id",
            "\"{0}\"\u306F\u4E0D\u6B63\u306A\u30B9\u30EC\u30C3\u30C9ID\u3067\u3059\u3002"
          },
          {
            "is not a valid threadgroup name",
            "\"{0}\"\u306F\u4E0D\u6B63\u306A\u30B9\u30EC\u30C3\u30C9\u30FB\u30B0\u30EB\u30FC\u30D7\u540D\u3067\u3059\u3002"
          },
          {"jdb prompt with no current thread", "> "},
          {"jdb prompt thread name and current stack frame", "{0}[{1,number,integer}] "},
          {"killed", "{0}\u304C\u5F37\u5236\u7D42\u4E86\u3055\u308C\u307E\u3057\u305F"},
          {"killing thread:", "\u5F37\u5236\u7D42\u4E86\u3059\u308B\u30B9\u30EC\u30C3\u30C9: {0}"},
          {
            "Line number information not available for",
            "\u30BD\u30FC\u30B9\u884C\u756A\u53F7\u306F\u3053\u306E\u5834\u6240\u3067\u306F\u4F7F\u7528\u3067\u304D\u307E\u305B\u3093\u3002"
          },
          {"line number", ":{0,number,integer}"},
          {"list field typename and name", "{0} {1}\n"},
          {"list field typename and name inherited", "{0} {1} ({2}\u304B\u3089\u7D99\u627F)\n"},
          {"list field typename and name hidden", "{0} {1} (\u975E\u8868\u793A)\n"},
          {
            "Listening at address:",
            "\u6B21\u306E\u30A2\u30C9\u30EC\u30B9\u3067\u30EA\u30B9\u30CB\u30F3\u30B0: {0}"
          },
          {
            "Local variable information not available.",
            "\u30ED\u30FC\u30AB\u30EB\u5909\u6570\u60C5\u5831\u304C\u3042\u308A\u307E\u305B\u3093\u3002\u5909\u6570\u60C5\u5831\u3092\u751F\u6210\u3059\u308B\u306B\u306F-g\u3092\u6307\u5B9A\u3057\u3066\u30B3\u30F3\u30D1\u30A4\u30EB\u3057\u3066\u304F\u3060\u3055\u3044"
          },
          {"Local variables:", "\u30ED\u30FC\u30AB\u30EB\u5909\u6570:"},
          {"<location unavailable>", "<location unavailable>"},
          {"location", "\"\u30B9\u30EC\u30C3\u30C9={0}\", {1}"},
          {"locationString", "{0}.{1}()\u3001\u884C={2,number,integer} bci={3,number,integer}"},
          {
            "Main class and arguments must be specified",
            "\u30E1\u30A4\u30F3\u30FB\u30AF\u30E9\u30B9\u3068\u5F15\u6570\u3092\u6307\u5B9A\u3059\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059"
          },
          {"Method arguments:", "\u30E1\u30BD\u30C3\u30C9\u5F15\u6570:"},
          {"Method entered:", "\u5165\u529B\u3055\u308C\u305F\u30E1\u30BD\u30C3\u30C9: "},
          {"Method exited:", "\u7D42\u4E86\u3057\u305F\u30E1\u30BD\u30C3\u30C9"},
          {
            "Method exitedValue:",
            "\u30E1\u30BD\u30C3\u30C9\u304C\u7D42\u4E86\u3057\u307E\u3057\u305F:"
                + " \u623B\u308A\u5024= {0}, "
          },
          {
            "Method is overloaded; specify arguments",
            "\u30E1\u30BD\u30C3\u30C9{0}\u304C\u30AA\u30FC\u30D0\u30FC\u30ED\u30FC\u30C9\u3055\u308C\u3066\u3044\u307E\u3059\u3002\u5F15\u6570\u3092\u6307\u5B9A\u3057\u3066\u304F\u3060\u3055\u3044"
          },
          {
            "minus version",
            "\u3053\u308C\u306F{0}\u30D0\u30FC\u30B8\u30E7\u30F3{1,number,integer}.{2,number,integer}"
                + " (Java SE\u30D0\u30FC\u30B8\u30E7\u30F3{3})\u3067\u3059"
          },
          {
            "Monitor information for thread",
            "\u30B9\u30EC\u30C3\u30C9{0}\u306E\u60C5\u5831\u306E\u30E2\u30CB\u30BF\u30FC:"
          },
          {
            "Monitor information for expr",
            "{0} ({1})\u306E\u60C5\u5831\u306E\u30E2\u30CB\u30BF\u30FC:"
          },
          {
            "More than one class named",
            "\u540D\u524D''{0}''\u306E\u30AF\u30E9\u30B9\u304C\u8907\u6570\u3042\u308A\u307E\u3059"
          },
          {"native method", "native\u30E1\u30BD\u30C3\u30C9"},
          {"nested:", "\u30CD\u30B9\u30C8\u3055\u308C\u3066\u3044\u307E\u3059: {0}"},
          {
            "No attach address specified.",
            "\u63A5\u7D9A\u30A2\u30C9\u30EC\u30B9\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "No breakpoints set.",
            "\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8\u304C\u8A2D\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "No class named",
            "\u540D\u524D''{0}''\u306E\u30AF\u30E9\u30B9\u304C\u3042\u308A\u307E\u305B\u3093"
          },
          {
            "No class specified.",
            "\u30AF\u30E9\u30B9\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "No classpath specified.",
            "\u30AF\u30E9\u30B9\u30D1\u30B9\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "No code at line",
            "\u884C{0,number,integer}"
                + " ({1}\u5185)\u306B\u30B3\u30FC\u30C9\u304C\u3042\u308A\u307E\u305B\u3093"
          },
          {
            "No connect specification.",
            "\u63A5\u7D9A\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "No connector named:",
            "\u540D\u524D{0}\u306E\u30B3\u30CD\u30AF\u30BF\u304C\u3042\u308A\u307E\u305B\u3093"
          },
          {
            "No current thread",
            "\u73FE\u5728\u306E\u30B9\u30EC\u30C3\u30C9\u304C\u3042\u308A\u307E\u305B\u3093"
          },
          {
            "No default thread specified:",
            "\u30C7\u30D5\u30A9\u30EB\u30C8\u306E\u30B9\u30EC\u30C3\u30C9\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002\u6700\u521D\u306B\"thread\"\u30B3\u30DE\u30F3\u30C9\u3092\u4F7F\u7528\u3057\u3066\u304F\u3060\u3055\u3044\u3002"
          },
          {
            "No exception object specified.",
            "\u4F8B\u5916\u30AA\u30D6\u30B8\u30A7\u30AF\u30C8\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "No exceptions caught.",
            "\u4F8B\u5916\u304C\u6355\u6349\u3055\u308C\u307E\u305B\u3093\u3067\u3057\u305F\u3002"
          },
          {
            "No expression specified.",
            "\u5F0F\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "No field in",
            "{1}\u306B\u30D5\u30A3\u30FC\u30EB\u30C9{0}\u304C\u3042\u308A\u307E\u305B\u3093"
          },
          {
            "No frames on the current call stack",
            "\u73FE\u5728\u306E\u30B3\u30FC\u30EB\u30FB\u30B9\u30BF\u30C3\u30AF\u306B\u30D5\u30EC\u30FC\u30E0\u304C\u3042\u308A\u307E\u305B\u3093"
          },
          {
            "No linenumber information for",
            "{0}\u306E\u884C\u756A\u53F7\u60C5\u5831\u304C\u3042\u308A\u307E\u305B\u3093\u3002\u30C7\u30D0\u30C3\u30B0\u3092\u30AA\u30F3\u306B\u3057\u3066\u30B3\u30F3\u30D1\u30A4\u30EB\u3057\u3066\u304F\u3060\u3055\u3044\u3002"
          },
          {
            "No local variables",
            "\u30ED\u30FC\u30AB\u30EB\u5909\u6570\u304C\u3042\u308A\u307E\u305B\u3093"
          },
          {
            "No method in",
            "{1}\u306B\u30E1\u30BD\u30C3\u30C9{0}\u304C\u3042\u308A\u307E\u305B\u3093"
          },
          {
            "No method specified.",
            "\u30E1\u30BD\u30C3\u30C9\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "No monitor numbered:",
            "\u756A\u53F7\u4ED8\u3051\u3055\u308C\u3066\u3044\u308B\u30E2\u30CB\u30BF\u30FC\u304C\u3042\u308A\u307E\u305B\u3093:"
                + " {0}"
          },
          {
            "No monitors owned",
            "  \u6240\u6709\u3055\u308C\u3066\u3044\u308B\u30E2\u30CB\u30BF\u30FC\u304C\u3042\u308A\u307E\u305B\u3093"
          },
          {
            "No object specified.",
            "\u30AA\u30D6\u30B8\u30A7\u30AF\u30C8\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "No objects specified.",
            "\u30AA\u30D6\u30B8\u30A7\u30AF\u30C8\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "No save index specified.",
            "\u4FDD\u5B58\u30A4\u30F3\u30C7\u30C3\u30AF\u30B9\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "No saved values",
            "\u4FDD\u5B58\u3055\u308C\u305F\u5024\u304C\u3042\u308A\u307E\u305B\u3093"
          },
          {
            "No source information available for:",
            "{0}\u306E\u30BD\u30FC\u30B9\u60C5\u5831\u304C\u5229\u7528\u3067\u304D\u307E\u305B\u3093"
          },
          {
            "No sourcedebugextension specified",
            "SourceDebugExtension\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093"
          },
          {
            "No sourcepath specified.",
            "\u30BD\u30FC\u30B9\u30FB\u30D1\u30B9\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "No thread specified.",
            "\u30B9\u30EC\u30C3\u30C9\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {"No VM connected", "VM\u304C\u63A5\u7D9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093"},
          {"No waiters", "  \u5F85\u6A5F\u306F\u3042\u308A\u307E\u305B\u3093"},
          {"not a class", "{0}\u306F\u30AF\u30E9\u30B9\u3067\u306F\u3042\u308A\u307E\u305B\u3093"},
          {
            "Not a monitor number:",
            "\u30E2\u30CB\u30BF\u30FC\u756A\u53F7\u3067\u306F\u3042\u308A\u307E\u305B\u3093:"
                + " ''{0}''"
          },
          {
            "not found (try the full name)",
            "{0}\u304C\u898B\u3064\u304B\u308A\u307E\u305B\u3093(\u30D5\u30EB\u30CD\u30FC\u30E0\u3092\u8A66\u3057\u3066\u304F\u3060\u3055\u3044)"
          },
          {"Not found:", "\u898B\u3064\u304B\u308A\u307E\u305B\u3093: {0}"},
          {"not found", "{0}\u304C\u898B\u3064\u304B\u308A\u307E\u305B\u3093"},
          {"Not owned", "  \u6240\u6709\u3055\u308C\u3066\u3044\u307E\u305B\u3093"},
          {
            "Not waiting for a monitor",
            "  \u30E2\u30CB\u30BF\u30FC\u3092\u5F85\u6A5F\u3057\u3066\u3044\u307E\u305B\u3093"
          },
          {
            "Nothing suspended.",
            "\u4F55\u3082\u4E2D\u65AD\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {"object description and hex id", "({0}){1}"},
          {
            "Operation is not supported on the target VM",
            "\u64CD\u4F5C\u306F\u30BF\u30FC\u30B2\u30C3\u30C8VM\u3067\u306F\u30B5\u30DD\u30FC\u30C8\u3055\u308C\u3066\u3044\u307E\u305B\u3093"
          },
          {
            "operation not yet supported",
            "\u307E\u3060\u30B5\u30DD\u30FC\u30C8\u3055\u308C\u3066\u3044\u306A\u3044\u64CD\u4F5C"
          },
          {
            "Owned by:",
            "  \u6240\u6709\u8005: {0}\u3001\u30A8\u30F3\u30C8\u30EA\u6570: {1,number,integer}"
          },
          {
            "Owned monitor:",
            "  \u6240\u6709\u3055\u308C\u3066\u3044\u308B\u30E2\u30CB\u30BF\u30FC: {0}"
          },
          {"Parse exception:", "\u4F8B\u5916\u306E\u89E3\u6790: {0}"},
          {
            "printbreakpointcommandusage",
            "\u4F7F\u7528\u65B9\u6CD5: {0} <class>:<line_number>\u307E\u305F\u306F\n"
                + "       {1} <class>.<method_name>[(argument_type,...)]"
          },
          {"Removed:", "{0}\u306F\u524A\u9664\u3055\u308C\u307E\u3057\u305F"},
          {
            "Requested stack frame is no longer active:",
            "\u30EA\u30AF\u30A8\u30B9\u30C8\u3055\u308C\u305F\u30B9\u30BF\u30C3\u30AF\u30FB\u30D5\u30EC\u30FC\u30E0\u306F\u73FE\u5728\u30A2\u30AF\u30C6\u30A3\u30D6\u3067\u306F\u3042\u308A\u307E\u305B\u3093:"
                + " {0,number,integer}"
          },
          {
            "run <args> command is valid only with launched VMs",
            "'run <args>'\u30B3\u30DE\u30F3\u30C9\u306F\u8D77\u52D5\u6E08\u306EVM\u3067\u306E\u307F\u6709\u52B9\u3067\u3059"
          },
          {"run", "{0}\u306E\u5B9F\u884C"},
          {"saved", "{0}\u304C\u4FDD\u5B58\u3055\u308C\u307E\u3057\u305F"},
          {"Set deferred", "\u9045\u5EF6\u3057\u305F{0}\u306E\u8A2D\u5B9A"},
          {"Set", "{0}\u306E\u8A2D\u5B9A"},
          {
            "Source file not found:",
            "\u30BD\u30FC\u30B9\u30FB\u30D5\u30A1\u30A4\u30EB\u304C\u898B\u3064\u304B\u308A\u307E\u305B\u3093:"
                + " {0}"
          },
          {"source line number and line", "{0,number,integer}    {1}"},
          {"source line number current line and line", "{0,number,integer} => {1}"},
          {"sourcedebugextension", "SourceDebugExtension -- {0}"},
          {
            "Specify class and method",
            "\u30AF\u30E9\u30B9\u3068\u30E1\u30BD\u30C3\u30C9\u306E\u6307\u5B9A"
          },
          {
            "Specify classes to redefine",
            "\u518D\u5B9A\u7FA9\u3059\u308B\u30AF\u30E9\u30B9\u306E\u6307\u5B9A"
          },
          {
            "Specify file name for class",
            "\u30AF\u30E9\u30B9{0}\u306E\u30D5\u30A1\u30A4\u30EB\u540D\u306E\u6307\u5B9A"
          },
          {"stack frame dump with pc", "  [{0,number,integer}] {1}.{2} ({3})\u3001pc = {4}"},
          {"stack frame dump", "  [{0,number,integer}] {1}.{2} ({3})"},
          {
            "Step completed:",
            "\u30B9\u30C6\u30C3\u30D7\u304C\u5B8C\u4E86\u3057\u307E\u3057\u305F: "
          },
          {
            "Stopping due to deferred breakpoint errors.",
            "\u9045\u5EF6\u3057\u305F\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8\u30FB\u30A8\u30E9\u30FC\u304C\u539F\u56E0\u3067\u505C\u6B62\u3057\u3066\u3044\u307E\u3059\u3002\n"
          },
          {"subclass:", "\u30B5\u30D6\u30AF\u30E9\u30B9: {0}"},
          {"subinterface:", "\u30B5\u30D6\u30A4\u30F3\u30BF\u30D5\u30A7\u30FC\u30B9: {0}"},
          {"tab", "\t{0}"},
          {
            "Target VM failed to initialize.",
            "\u30BF\u30FC\u30B2\u30C3\u30C8VM\u304C\u521D\u671F\u5316\u306B\u5931\u6557\u3057\u307E\u3057\u305F\u3002"
          },
          {
            "The application exited",
            "\u30A2\u30D7\u30EA\u30B1\u30FC\u30B7\u30E7\u30F3\u304C\u7D42\u4E86\u3057\u307E\u3057\u305F"
          },
          {
            "The application has been disconnected",
            "\u30A2\u30D7\u30EA\u30B1\u30FC\u30B7\u30E7\u30F3\u304C\u5207\u65AD\u3055\u308C\u307E\u3057\u305F"
          },
          {
            "The gc command is no longer necessary.",
            "'gc'\u30B3\u30DE\u30F3\u30C9\u306F\u4E0D\u8981\u306B\u306A\u308A\u307E\u3057\u305F\u3002\n"
                + "\u3059\u3079\u3066\u306E\u30AA\u30D6\u30B8\u30A7\u30AF\u30C8\u306F\u901A\u5E38\u3069\u304A\u308A\u30AC\u30D9\u30FC\u30B8\u30FB\u30B3\u30EC\u30AF\u30B7\u30E7\u30F3\u3055\u308C\u307E\u3059\u3002\u500B\u3005\u306E\u30AA\u30D6\u30B8\u30A7\u30AF\u30C8\u306E\n"
                + "\u30AC\u30D9\u30FC\u30B8\u30FB\u30B3\u30EC\u30AF\u30B7\u30E7\u30F3\u3092\u5236\u5FA1\u3059\u308B\u306B\u306F'enablegc'\u304A\u3088\u3073'disablegc'\u30B3\u30DE\u30F3\u30C9\u3092\u4F7F\u7528\u3057\u3066\u304F\u3060\u3055\u3044\u3002"
          },
          {
            "The load command is no longer supported.",
            "'load'\u30B3\u30DE\u30F3\u30C9\u306F\u73FE\u5728\u30B5\u30DD\u30FC\u30C8\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "The memory command is no longer supported.",
            "'memory'\u30B3\u30DE\u30F3\u30C9\u306F\u73FE\u5728\u30B5\u30DD\u30FC\u30C8\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "The VM does not use paths",
            "VM\u306F\u30D1\u30B9\u3092\u4F7F\u7528\u3057\u307E\u305B\u3093"
          },
          {
            "Thread is not running (no stack).",
            "\u30B9\u30EC\u30C3\u30C9\u306F\u5B9F\u884C\u4E2D\u3067\u306F\u3042\u308A\u307E\u305B\u3093(\u30B9\u30BF\u30C3\u30AF\u306A\u3057)\u3002"
          },
          {
            "Thread number not specified.",
            "\u30B9\u30EC\u30C3\u30C9\u756A\u53F7\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {"Thread:", "{0}:"},
          {"Thread Group:", "\u30B0\u30EB\u30FC\u30D7{0}:"},
          {
            "Thread description name unknownStatus BP",
            "  {0}"
                + " {1}\u306F\u4E0D\u660E\u3067\u3059(\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8)"
          },
          {"Thread description name unknownStatus", "  {0} {1}\u306F\u4E0D\u660E\u3067\u3059"},
          {
            "Thread description name zombieStatus BP",
            "  {0}"
                + " {1}\u306F\u30BE\u30F3\u30D3\u3067\u3059(\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8\u5730\u70B9)"
          },
          {"Thread description name zombieStatus", "  {0} {1}\u306F\u30BE\u30F3\u30D3\u3067\u3059"},
          {
            "Thread description name runningStatus BP",
            "  {0}"
                + " {1}\u306F\u5B9F\u884C\u4E2D\u3067\u3059(\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8)"
          },
          {
            "Thread description name runningStatus", "  {0} {1}\u306F\u5B9F\u884C\u4E2D\u3067\u3059"
          },
          {
            "Thread description name sleepingStatus BP",
            "  {0}"
                + " {1}\u306F\u30B9\u30EA\u30FC\u30D7\u4E2D\u3067\u3059(\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8)"
          },
          {
            "Thread description name sleepingStatus",
            "  {0} {1}\u306F\u30B9\u30EA\u30FC\u30D7\u4E2D\u3067\u3059"
          },
          {
            "Thread description name waitingStatus BP",
            "  {0}"
                + " {1}\u306F\u30E2\u30CB\u30BF\u30FC\u5185\u3067\u5F85\u6A5F\u4E2D\u3067\u3059(\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8)"
          },
          {
            "Thread description name waitingStatus",
            "  {0} {1}\u306F\u30E2\u30CB\u30BF\u30FC\u5185\u3067\u5F85\u6A5F\u4E2D\u3067\u3059"
          },
          {
            "Thread description name condWaitstatus BP",
            "  {0}"
                + " {1}\u306F\u6761\u4EF6\u3092\u5F85\u6A5F\u4E2D\u3067\u3059(\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8)"
          },
          {
            "Thread description name condWaitstatus",
            "  {0} {1}\u306F\u6761\u4EF6\u3092\u5F85\u6A5F\u4E2D\u3067\u3059"
          },
          {
            "Thread has been resumed",
            "\u30B9\u30EC\u30C3\u30C9\u304C\u518D\u958B\u3057\u307E\u3057\u305F"
          },
          {
            "Thread not suspended",
            "\u30B9\u30EC\u30C3\u30C9\u306F\u4E2D\u65AD\u3057\u3066\u3044\u307E\u305B\u3093"
          },
          {"thread group number description name", "{0,number,integer}. {1} {2}"},
          {
            "Threadgroup name not specified.",
            "\u30B9\u30EC\u30C3\u30C9\u30B0\u30EB\u30FC\u30D7\u540D\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002"
          },
          {
            "Threads must be suspended",
            "\u30B9\u30EC\u30C3\u30C9\u3092\u4E2D\u65AD\u3059\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059"
          },
          {
            "trace method exit in effect for",
            "{0}\u306B\u5BFE\u3057\u3066\u6709\u52B9\u306A\u30E1\u30BD\u30C3\u30C9\u7D42\u4E86\u306E\u30C8\u30EC\u30FC\u30B9"
          },
          {
            "trace method exits in effect",
            "\u6709\u52B9\u306A\u30E1\u30BD\u30C3\u30C9\u7D42\u4E86\u306E\u30C8\u30EC\u30FC\u30B9"
          },
          {
            "trace methods in effect",
            "\u30E1\u30BD\u30C3\u30C9\u306E\u30C8\u30EC\u30FC\u30B9\u306E\u6709\u52B9\u5316"
          },
          {
            "trace go method exit in effect for",
            "{0}\u306B\u6709\u52B9\u306Ago\u30E1\u30BD\u30C3\u30C9\u7D42\u4E86\u306E\u30C8\u30EC\u30FC\u30B9"
          },
          {
            "trace go method exits in effect",
            "\u6709\u52B9\u306Ago\u30E1\u30BD\u30C3\u30C9\u7D42\u4E86\u306E\u30C8\u30EC\u30FC\u30B9"
          },
          {
            "trace go methods in effect",
            "go\u30E1\u30BD\u30C3\u30C9\u306E\u30C8\u30EC\u30FC\u30B9\u306E\u6709\u52B9\u5316"
          },
          {"trace not in effect", "\u30C8\u30EC\u30FC\u30B9\u306E\u7121\u52B9\u5316"},
          {
            "Unable to attach to target VM.",
            "\u30BF\u30FC\u30B2\u30C3\u30C8VM\u306B\u63A5\u7D9A\u3067\u304D\u307E\u305B\u3093\u3002"
          },
          {
            "Unable to display process output:",
            "\u30D7\u30ED\u30BB\u30B9\u51FA\u529B\u3092\u8868\u793A\u3067\u304D\u307E\u305B\u3093:"
                + " {0}"
          },
          {
            "Unable to launch target VM.",
            "\u30BF\u30FC\u30B2\u30C3\u30C8VM\u3092\u8D77\u52D5\u3067\u304D\u307E\u305B\u3093\u3002"
          },
          {
            "Unable to set deferred",
            "\u9045\u5EF6\u3057\u305F{0}\u3092\u8A2D\u5B9A\u3067\u304D\u307E\u305B\u3093: {1}"
          },
          {
            "Unable to set main class and arguments",
            "\u30E1\u30A4\u30F3\u30FB\u30AF\u30E9\u30B9\u3068\u5F15\u6570\u3092\u6307\u5B9A\u3067\u304D\u307E\u305B\u3093"
          },
          {"Unable to set", "{0}\u3092\u8A2D\u5B9A\u3067\u304D\u307E\u305B\u3093: {1}"},
          {
            "Unexpected event type",
            "\u4E88\u671F\u3057\u306A\u3044\u30A4\u30D9\u30F3\u30C8\u30FB\u30BF\u30A4\u30D7: {0}"
          },
          {"unknown", "\u4E0D\u660E"},
          {"Unmonitoring", "{0}\u306E\u30E2\u30CB\u30BF\u30EA\u30F3\u30B0\u89E3\u9664 "},
          {
            "Unrecognized command.  Try help...",
            "''{0}''\u306F\u8A8D\u8B58\u3055\u308C\u306A\u3044\u30B3\u30DE\u30F3\u30C9\u3067\u3059\u3002help\u3067\u78BA\u8A8D\u3057\u3066\u304F\u3060\u3055\u3044..."
          },
          {
            "Usage: catch exception",
            "\u4F7F\u7528\u65B9\u6CD5: catch [uncaught|caught|all] <class id>|<class pattern>"
          },
          {
            "Usage: ignore exception",
            "\u4F7F\u7528\u65B9\u6CD5: ignore [uncaught|caught|all] <class id>|<class pattern>"
          },
          {"Usage: down [n frames]", "\u4F7F\u7528\u65B9\u6CD5: down [n frames]"},
          {
            "Usage: kill <thread id> <throwable>",
            "\u4F7F\u7528\u65B9\u6CD5: kill <thread id> <throwable>"
          },
          {"Usage: read <command-filename>", "\u4F7F\u7528\u65B9\u6CD5: read <command-filename>"},
          {"Usage: unmonitor <monitor#>", "\u4F7F\u7528\u65B9\u6CD5: unmonitor <monitor#>"},
          {"Usage: up [n frames]", "\u4F7F\u7528\u65B9\u6CD5: up [n frames]"},
          {
            "Use java minus X to see",
            "\u4F7F\u7528\u53EF\u80FD\u306A\u975E\u6A19\u6E96\u30AA\u30D7\u30B7\u30E7\u30F3\u3092\u8868\u793A\u3059\u308B\u306B\u306F'java"
                + " -X'\u3092\u4F7F\u7528\u3057\u3066\u304F\u3060\u3055\u3044"
          },
          {
            "Use stop at to set a breakpoint at a line number",
            "\u884C\u756A\u53F7\u306B\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8\u3092\u8A2D\u5B9A\u3059\u308B\u306B\u306F'stop"
                + " at'\u3092\u4F7F\u7528\u3057\u3066\u304F\u3060\u3055\u3044"
          },
          {
            "VM already running. use cont to continue after events.",
            "VM\u306F\u3059\u3067\u306B\u5B9F\u884C\u4E2D\u3067\u3059\u3002\u30A4\u30D9\u30F3\u30C8\u5F8C\u306B\u7D9A\u884C\u3059\u308B\u306B\u306F'cont'\u3092\u4F7F\u7528\u3057\u3066\u304F\u3060\u3055\u3044\u3002"
          },
          {"VM Started:", "VM\u304C\u958B\u59CB\u3055\u308C\u307E\u3057\u305F: "},
          {
            "vmstartexception",
            "VM\u304C\u4F8B\u5916\u3092\u958B\u59CB\u3057\u307E\u3057\u305F: {0}"
          },
          {"Waiting for monitor:", "   \u30E2\u30CB\u30BF\u30FC\u306E\u5F85\u6A5F\u4E2D: {0}"},
          {"Waiting thread:", " \u30B9\u30EC\u30C3\u30C9\u3092\u5F85\u6A5F\u4E2D: {0}"},
          {"watch accesses of", "{0}.{1}\u306E\u30A2\u30AF\u30BB\u30B9\u3092\u76E3\u8996"},
          {"watch modification of", "{0}.{1}\u306E\u5909\u66F4\u306E\u76E3\u8996"},
          {
            "zz help text",
            "** \u30B3\u30DE\u30F3\u30C9\u30FB\u30EA\u30B9\u30C8 **\n"
                + "connectors                --"
                + " \u3053\u306EVM\u5185\u306E\u4F7F\u7528\u53EF\u80FD\u306A\u30B3\u30CD\u30AF\u30BF\u3068\u30C8\u30E9\u30F3\u30B9\u30DD\u30FC\u30C8\u3092\u30EA\u30B9\u30C8\u3057\u307E\u3059\n\n"
                + "run [class [args]]        --"
                + " \u30A2\u30D7\u30EA\u30B1\u30FC\u30B7\u30E7\u30F3\u306E\u30E1\u30A4\u30F3\u30FB\u30AF\u30E9\u30B9\u306E\u5B9F\u884C\u3092\u958B\u59CB\u3057\u307E\u3059\n\n"
                + "threads [threadgroup]     --"
                + " \u30B9\u30EC\u30C3\u30C9\u3092\u30EA\u30B9\u30C8\u3057\u307E\u3059\n"
                + "thread <thread id>        --"
                + " \u30C7\u30D5\u30A9\u30EB\u30C8\u306E\u30B9\u30EC\u30C3\u30C9\u3092\u8A2D\u5B9A\u3057\u307E\u3059\n"
                + "suspend [thread id(s)]    --"
                + " \u30B9\u30EC\u30C3\u30C9\u3092\u4E2D\u65AD\u3057\u307E\u3059(\u30C7\u30D5\u30A9\u30EB\u30C8:"
                + " \u3059\u3079\u3066)\n"
                + "resume [thread id(s)]     --"
                + " \u30B9\u30EC\u30C3\u30C9\u3092\u518D\u958B\u3057\u307E\u3059(\u30C7\u30D5\u30A9\u30EB\u30C8:"
                + " \u3059\u3079\u3066)\n"
                + "where [<thread id> | all] --"
                + " \u30B9\u30EC\u30C3\u30C9\u306E\u30B9\u30BF\u30C3\u30AF\u3092\u30C0\u30F3\u30D7\u3057\u307E\u3059\n"
                + "wherei [<thread id> | all]--"
                + " \u30B9\u30EC\u30C3\u30C9\u306E\u30B9\u30BF\u30C3\u30AF\u3092pc\u60C5\u5831\u3068\u3068\u3082\u306B\u30C0\u30F3\u30D7\u3057\u307E\u3059\n"
                + "up [n frames]             --"
                + " \u30B9\u30EC\u30C3\u30C9\u306E\u30B9\u30BF\u30C3\u30AF\u3092\u4E0A\u306B\u79FB\u52D5\u3057\u307E\u3059\n"
                + "down [n frames]           --"
                + " \u30B9\u30EC\u30C3\u30C9\u306E\u30B9\u30BF\u30C3\u30AF\u3092\u4E0B\u306B\u79FB\u52D5\u3057\u307E\u3059\n"
                + "kill <thread id> <expr>   --"
                + " \u6307\u5B9A\u3055\u308C\u305F\u4F8B\u5916\u30AA\u30D6\u30B8\u30A7\u30AF\u30C8\u3067\u30B9\u30EC\u30C3\u30C9\u3092\u5F37\u5236\u7D42\u4E86\u3057\u307E\u3059\n"
                + "interrupt <thread id>     --"
                + " \u30B9\u30EC\u30C3\u30C9\u3092\u4E2D\u65AD\u3057\u307E\u3059\n\n"
                + "print <expr>              --"
                + " \u5F0F\u306E\u5024\u3092\u51FA\u529B\u3057\u307E\u3059\n"
                + "dump <expr>               --"
                + " \u3059\u3079\u3066\u306E\u30AA\u30D6\u30B8\u30A7\u30AF\u30C8\u60C5\u5831\u3092\u51FA\u529B\u3057\u307E\u3059\n"
                + "eval <expr>               --"
                + " \u5F0F\u3092\u8A55\u4FA1\u3057\u307E\u3059(print\u3068\u540C\u3058)\n"
                + "set <lvalue> = <expr>     --"
                + " \u65B0\u3057\u3044\u5024\u3092\u30D5\u30A3\u30FC\u30EB\u30C9/\u5909\u6570/\u914D\u5217\u8981\u7D20\u306B\u4EE3\u5165\u3057\u307E\u3059\n"
                + "locals                    --"
                + " \u73FE\u5728\u306E\u30B9\u30BF\u30C3\u30AF\u30FB\u30D5\u30EC\u30FC\u30E0\u5185\u306E\u3059\u3079\u3066\u306E\u30ED\u30FC\u30AB\u30EB\u5909\u6570\u3092\u51FA\u529B\u3057\u307E\u3059\n\n"
                + "classes                   --"
                + " \u73FE\u5728\u65E2\u77E5\u306E\u30AF\u30E9\u30B9\u3092\u30EA\u30B9\u30C8\u3057\u307E\u3059\n"
                + "class <class id>          --"
                + " \u6307\u5B9A\u3057\u305F\u30AF\u30E9\u30B9\u306E\u8A73\u7D30\u3092\u8868\u793A\u3057\u307E\u3059\n"
                + "methods <class id>        --"
                + " \u30AF\u30E9\u30B9\u306E\u30E1\u30BD\u30C3\u30C9\u3092\u30EA\u30B9\u30C8\u3057\u307E\u3059\n"
                + "fields <class id>         --"
                + " \u30AF\u30E9\u30B9\u306E\u30D5\u30A3\u30FC\u30EB\u30C9\u3092\u30EA\u30B9\u30C8\u3057\u307E\u3059\n\n"
                + "threadgroups              --"
                + " \u30B9\u30EC\u30C3\u30C9\u30B0\u30EB\u30FC\u30D7\u3092\u30EA\u30B9\u30C8\u3057\u307E\u3059\n"
                + "threadgroup <name>        --"
                + " \u73FE\u5728\u306E\u30B9\u30EC\u30C3\u30C9\u30B0\u30EB\u30FC\u30D7\u3092\u8A2D\u5B9A\u3057\u307E\u3059\n\n"
                + "stop in <class id>.<method>[(argument_type,...)]\n"
                + "                          --"
                + " \u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8\u3092\u30E1\u30BD\u30C3\u30C9\u5185\u306B\u8A2D\u5B9A\u3057\u307E\u3059\n"
                + "stop at <class id>:<line> --"
                + " \u884C\u306B\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8\u3092\u8A2D\u5B9A\u3057\u307E\u3059\n"
                + "clear <class id>.<method>[(argument_type,...)]\n"
                + "                          --"
                + " \u30E1\u30BD\u30C3\u30C9\u5185\u306E\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8\u3092\u30AF\u30EA\u30A2\u3057\u307E\u3059\n"
                + "clear <class id>:<line>   --"
                + " \u884C\u306E\u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8\u3092\u30AF\u30EA\u30A2\u3057\u307E\u3059\n"
                + "clear                     --"
                + " \u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8\u3092\u30EA\u30B9\u30C8\u3057\u307E\u3059\n"
                + "catch [uncaught|caught|all] <class id>|<class pattern>\n"
                + "                          --"
                + " \u6307\u5B9A\u3055\u308C\u305F\u4F8B\u5916\u304C\u767A\u751F\u3057\u305F\u3068\u304D\u306B\u30D6\u30EC\u30FC\u30AF\u3057\u307E\u3059\n"
                + "ignore [uncaught|caught|all] <class id>|<class pattern>\n"
                + "                          --"
                + " \u6307\u5B9A\u3055\u308C\u305F\u4F8B\u5916\u306E'catch'\u3092\u53D6\u308A\u6D88\u3057\u307E\u3059\n"
                + "watch [access|all] <class id>.<field name>\n"
                + "                          --"
                + " \u30D5\u30A3\u30FC\u30EB\u30C9\u3078\u306E\u30A2\u30AF\u30BB\u30B9\u307E\u305F\u306F\u5909\u66F4\u3092\u76E3\u8996\u3057\u307E\u3059\n"
                + "unwatch [access|all] <class id>.<field name>\n"
                + "                          --"
                + " \u30D5\u30A3\u30FC\u30EB\u30C9\u3078\u306E\u30A2\u30AF\u30BB\u30B9\u307E\u305F\u306F\u5909\u66F4\u306E\u76E3\u8996\u3092\u4E2D\u6B62\u3057\u307E\u3059\n"
                + "trace [go] methods [thread]\n"
                + "                          --"
                + " \u30E1\u30BD\u30C3\u30C9\u306E\u5165\u308A\u53E3\u3068\u51FA\u53E3\u3092\u30C8\u30EC\u30FC\u30B9\u3057\u307E\u3059\u3002\n"
                + "                          --"
                + " 'go'\u304C\u6307\u5B9A\u3055\u308C\u308B\u307E\u3067\u3059\u3079\u3066\u306E\u30B9\u30EC\u30C3\u30C9\u306F\u4E2D\u65AD\u3057\u307E\u3059\n"
                + "trace [go] method exit | exits [thread]\n"
                + "                          --"
                + " \u73FE\u5728\u306E\u30E1\u30BD\u30C3\u30C9\u306E\u51FA\u53E3\u307E\u305F\u306F\u3059\u3079\u3066\u306E\u30E1\u30BD\u30C3\u30C9\u306E\u51FA\u53E3\u3092\u30C8\u30EC\u30FC\u30B9\u3057\u307E\u3059\n"
                + "                          --"
                + " 'go'\u304C\u6307\u5B9A\u3055\u308C\u308B\u307E\u3067\u3059\u3079\u3066\u306E\u30B9\u30EC\u30C3\u30C9\u306F\u4E2D\u65AD\u3057\u307E\u3059\n"
                + "untrace [methods]         --"
                + " \u30E1\u30BD\u30C3\u30C9\u306E\u958B\u59CB\u307E\u305F\u306F\u7D42\u4E86\u306E\u30C8\u30EC\u30FC\u30B9\u3092\u505C\u6B62\u3057\u307E\u3059\n"
                + "step                      --"
                + " \u73FE\u5728\u306E\u884C\u3092\u5B9F\u884C\u3057\u307E\u3059\n"
                + "step up                   --"
                + " \u73FE\u5728\u306E\u30E1\u30BD\u30C3\u30C9\u304C\u30E1\u30BD\u30C3\u30C9\u306E\u547C\u51FA\u3057\u5143\u306B\u623B\u308B\u307E\u3067\u5B9F\u884C\u3057\u307E\u3059\n"
                + "stepi                     --"
                + " \u73FE\u5728\u306E\u547D\u4EE4\u3092\u5B9F\u884C\u3057\u307E\u3059\n"
                + "next                      --"
                + " 1\u884C\u3092\u30B9\u30C6\u30C3\u30D7\u5B9F\u884C\u3057\u307E\u3059(\u547C\u51FA\u3057\u3092\u30B9\u30C6\u30C3\u30D7\u30AA\u30FC\u30D0\u30FC)\n"
                + "cont                      --"
                + " \u30D6\u30EC\u30FC\u30AF\u30DD\u30A4\u30F3\u30C8\u304B\u3089\u5B9F\u884C\u3092\u7D9A\u884C\u3057\u307E\u3059\n\n"
                + "list [line number|method] --"
                + " \u30BD\u30FC\u30B9\u30FB\u30B3\u30FC\u30C9\u3092\u51FA\u529B\u3057\u307E\u3059\n"
                + "use (or sourcepath) [source file path]\n"
                + "                          --"
                + " \u30BD\u30FC\u30B9\u30FB\u30D1\u30B9\u3092\u8868\u793A\u307E\u305F\u306F\u5909\u66F4\u3057\u307E\u3059\n"
                + "exclude [<class pattern>, ... | \"none\"]\n"
                + "                          --"
                + " \u6307\u5B9A\u3057\u305F\u30AF\u30E9\u30B9\u306E\u30B9\u30C6\u30C3\u30D7\u3084\u30E1\u30BD\u30C3\u30C9\u30FB\u30A4\u30D9\u30F3\u30C8\u3092\u5831\u544A\u3057\u307E\u305B\u3093\n"
                + "classpath                 --"
                + " \u30BF\u30FC\u30B2\u30C3\u30C8VM\u304B\u3089\u30AF\u30E9\u30B9\u30D1\u30B9\u60C5\u5831\u3092\u51FA\u529B\u3057\u307E\u3059\n\n"
                + "monitor <command>         --"
                + " \u30D7\u30ED\u30B0\u30E9\u30E0\u304C\u505C\u6B62\u3059\u308B\u305F\u3073\u306B\u30B3\u30DE\u30F3\u30C9\u3092\u5B9F\u884C\u3057\u307E\u3059\n"
                + "monitor                   --"
                + " \u30E2\u30CB\u30BF\u30FC\u3092\u30EA\u30B9\u30C8\u3057\u307E\u3059\n"
                + "unmonitor <monitor#>      --"
                + " \u30E2\u30CB\u30BF\u30FC\u3092\u524A\u9664\u3057\u307E\u3059\n"
                + "read <filename>           --"
                + " \u30B3\u30DE\u30F3\u30C9\u30FB\u30D5\u30A1\u30A4\u30EB\u3092\u8AAD\u307F\u53D6\u3063\u3066\u5B9F\u884C\u3057\u307E\u3059\n\n"
                + "lock <expr>               --"
                + " \u30AA\u30D6\u30B8\u30A7\u30AF\u30C8\u306E\u30ED\u30C3\u30AF\u60C5\u5831\u3092\u51FA\u529B\u3057\u307E\u3059\n"
                + "threadlocks [thread id]   --"
                + " \u30B9\u30EC\u30C3\u30C9\u306E\u30ED\u30C3\u30AF\u60C5\u5831\u3092\u51FA\u529B\u3057\u307E\u3059\n\n"
                + "pop                       --"
                + " \u73FE\u5728\u306E\u30D5\u30EC\u30FC\u30E0\u307E\u3067\u306E\u3059\u3079\u3066\u306E\u30B9\u30BF\u30C3\u30AF\u3092\u30DD\u30C3\u30D7\u3057\u307E\u3059\n"
                + "reenter                   --"
                + " pop\u3068\u540C\u3058\u3067\u3059\u304C\u3001\u73FE\u5728\u306E\u30D5\u30EC\u30FC\u30E0\u304C\u518D\u5165\u529B\u3055\u308C\u307E\u3059\n"
                + "redefine <class id> <class file name>\n"
                + "                          --"
                + " \u30AF\u30E9\u30B9\u306E\u30B3\u30FC\u30C9\u3092\u518D\u5B9A\u7FA9\u3057\u307E\u3059\n\n"
                + "disablegc <expr>          --"
                + " \u30AA\u30D6\u30B8\u30A7\u30AF\u30C8\u306E\u30AC\u30D9\u30FC\u30B8\u30FB\u30B3\u30EC\u30AF\u30B7\u30E7\u30F3\u3092\u6291\u5236\u3057\u307E\u3059\n"
                + "enablegc <expr>           --"
                + " \u30AA\u30D6\u30B8\u30A7\u30AF\u30C8\u306E\u30AC\u30D9\u30FC\u30B8\u30FB\u30B3\u30EC\u30AF\u30B7\u30E7\u30F3\u3092\u8A31\u53EF\u3057\u307E\u3059\n\n"
                + "!!                        --"
                + " \u6700\u5F8C\u306E\u30B3\u30DE\u30F3\u30C9\u3092\u7E70\u308A\u8FD4\u3057\u307E\u3059\n"
                + "<n> <command>             --"
                + " \u30B3\u30DE\u30F3\u30C9\u3092n\u56DE\u7E70\u308A\u8FD4\u3057\u307E\u3059\n"
                + "# <command>               --"
                + " \u7834\u68C4\u3057\u307E\u3059(\u64CD\u4F5C\u306A\u3057)\n"
                + "help (\u307E\u305F\u306F?)               --"
                + " \u30B3\u30DE\u30F3\u30C9\u3092\u30EA\u30B9\u30C8\u3057\u307E\u3059\n"
                + "version                   --"
                + " \u30D0\u30FC\u30B8\u30E7\u30F3\u60C5\u5831\u3092\u51FA\u529B\u3057\u307E\u3059\n"
                + "exit (\u307E\u305F\u306Fquit)            --"
                + " \u30C7\u30D0\u30C3\u30AC\u3092\u7D42\u4E86\u3057\u307E\u3059\n\n"
                + "<class id>:"
                + " \u30D1\u30C3\u30B1\u30FC\u30B8\u4FEE\u98FE\u5B50\u3092\u542B\u3080\u5B8C\u5168\u30AF\u30E9\u30B9\u540D\n"
                + "<class pattern>:"
                + " \u5148\u982D\u307E\u305F\u306F\u672B\u5C3E\u306E\u30EF\u30A4\u30EB\u30C9\u30AB\u30FC\u30C9('*')\u3092\u542B\u3080\u30AF\u30E9\u30B9\u540D\n"
                + "<thread id>:"
                + " 'threads'\u30B3\u30DE\u30F3\u30C9\u3067\u5831\u544A\u3055\u308C\u308B\u30B9\u30EC\u30C3\u30C9\u756A\u53F7\n"
                + "<expr>:"
                + " Java(TM)\u30D7\u30ED\u30B0\u30E9\u30DF\u30F3\u30B0\u8A00\u8A9E\u306E\u5F0F\u3002\n"
                + "\u307B\u3068\u3093\u3069\u306E\u4E00\u822C\u7684\u306A\u69CB\u6587\u304C\u30B5\u30DD\u30FC\u30C8\u3055\u308C\u3066\u3044\u307E\u3059\u3002\n\n"
                + "\u8D77\u52D5\u30B3\u30DE\u30F3\u30C9\u306F\u3001\"jdb.ini\"\u307E\u305F\u306F\".jdbrc\"\u306B\u914D\u7F6E\u3067\u304D\u307E\u3059\n"
                + "(user.home\u307E\u305F\u306Fuser.dir\u5185)"
          },
          {
            "zz usage text",
            "\u4F7F\u7528\u65B9\u6CD5: {0} <options> <class> <arguments>\n\n"
                + "\u30AA\u30D7\u30B7\u30E7\u30F3\u306F\u6B21\u306E\u3068\u304A\u308A\u3067\u3059:\n"
                + "    -help            "
                + " \u3053\u306E\u30E1\u30C3\u30BB\u30FC\u30B8\u3092\u51FA\u529B\u3057\u3066\u7D42\u4E86\u3059\u308B\n"
                + "    -sourcepath <directories separated by \"{1}\">\n"
                + "                     "
                + " \u30BD\u30FC\u30B9\u30FB\u30D5\u30A1\u30A4\u30EB\u3092\u691C\u7D22\u3059\u308B\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\n"
                + "    -attach <address>\n"
                + "                     "
                + " \u6A19\u6E96\u30B3\u30CD\u30AF\u30BF\u3092\u4F7F\u7528\u3057\u3066\u3001\u6307\u5B9A\u3055\u308C\u305F\u30A2\u30C9\u30EC\u30B9\u3067\u5B9F\u884C\u4E2D\u306EVM\u306B\u63A5\u7D9A\u3059\u308B\n"
                + "    -listen <address>\n"
                + "                     "
                + " \u6A19\u6E96\u30B3\u30CD\u30AF\u30BF\u3092\u4F7F\u7528\u3057\u3066\u3001\u6307\u5B9A\u3055\u308C\u305F\u30A2\u30C9\u30EC\u30B9\u3067\u5B9F\u884C\u4E2D\u306EVM\u306E\u63A5\u7D9A\u3092\u5F85\u6A5F\u3059\u308B\n"
                + "    -listenany\n"
                + "                     "
                + " \u6A19\u6E96\u30B3\u30CD\u30AF\u30BF\u3092\u4F7F\u7528\u3057\u3066\u3001\u4F7F\u7528\u53EF\u80FD\u306A\u4EFB\u610F\u306E\u30A2\u30C9\u30EC\u30B9\u3067\u5B9F\u884C\u4E2D\u306EVM\u306E\u63A5\u7D9A\u3092\u5F85\u6A5F\u3059\u308B\n"
                + "    -launch\n"
                + "                     "
                + " ''run''\u30B3\u30DE\u30F3\u30C9\u3092\u5F85\u6A5F\u305B\u305A\u306BVM\u3092\u5373\u6642\u306B\u8D77\u52D5\u3059\u308B\n"
                + "    -listconnectors  "
                + " \u3053\u306EVM\u3067\u4F7F\u7528\u53EF\u80FD\u306A\u30B3\u30CD\u30AF\u30BF\u3092\u30EA\u30B9\u30C8\u3059\u308B\n"
                + "    -connect <connector-name>:<name1>=<value1>,...\n"
                + "                     "
                + " \u6307\u5B9A\u3055\u308C\u305F\u30B3\u30CD\u30AF\u30BF\u3092\u4F7F\u7528\u3057\u3066\u3001\u30EA\u30B9\u30C8\u3055\u308C\u305F\u5F15\u6570\u5024\u3067\u30BF\u30FC\u30B2\u30C3\u30C8VM\u306B\u63A5\u7D9A\u3059\u308B\n"
                + "    -dbgtrace [flags]"
                + " {0}\u306E\u30C7\u30D0\u30C3\u30B0\u306E\u60C5\u5831\u3092\u51FA\u529B\u3059\u308B\n"
                + "    -tclient         "
                + " \u30A2\u30D7\u30EA\u30B1\u30FC\u30B7\u30E7\u30F3\u3092HotSpot(TM) Client"
                + " Compiler\u3067\u5B9F\u884C\u3059\u308B\n"
                + "    -tserver         "
                + " \u30A2\u30D7\u30EA\u30B1\u30FC\u30B7\u30E7\u30F3\u3092HotSpot(TM) Server"
                + " Compiler\u3067\u5B9F\u884C\u3059\u308B\n\n"
                + "\u30AA\u30D7\u30B7\u30E7\u30F3\u306F\u30C7\u30D0\u30C3\u30B0\u3059\u308B\u30D7\u30ED\u30BB\u30B9\u306B\u8EE2\u9001\u3055\u308C\u307E\u3059:\n"
                + "    -v -verbose[:class|gc|jni]\n"
                + "                     "
                + " \u8A73\u7D30\u30E2\u30FC\u30C9\u3092\u30AA\u30F3\u306B\u3059\u308B\n"
                + "    -D<name>=<value> "
                + " \u30B7\u30B9\u30C6\u30E0\u30FB\u30D7\u30ED\u30D1\u30C6\u30A3\u3092\u8A2D\u5B9A\u3059\u308B\n"
                + "    -classpath <directories separated by \"{1}\">\n"
                + "                     "
                + " \u30AF\u30E9\u30B9\u3092\u691C\u7D22\u3059\u308B\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u3092\u30EA\u30B9\u30C8\u3059\u308B\n"
                + "    -X<option>       "
                + " \u975E\u6A19\u6E96\u306E\u30BF\u30FC\u30B2\u30C3\u30C8VM\u30AA\u30D7\u30B7\u30E7\u30F3\n\n"
                + "<class>\u306F\u30C7\u30D0\u30C3\u30B0\u3092\u958B\u59CB\u3059\u308B\u30AF\u30E9\u30B9\u306E\u540D\u524D\u3067\u3059\n"
                + "<arguments>\u306F<class>\u306Emain()\u30E1\u30BD\u30C3\u30C9\u306B\u6E21\u3055\u308C\u308B\u5F15\u6570\u3067\u3059\n\n"
                + "\u30B3\u30DE\u30F3\u30C9\u306E\u30D8\u30EB\u30D7\u306B\u3064\u3044\u3066\u306F{0}\u30D7\u30ED\u30F3\u30D7\u30C8\u3067''help''\u3092\u5165\u529B\u3057\u3066\u304F\u3060\u3055\u3044"
          },
          // END OF MATERIAL TO LOCALIZE
        };

    return temp;
  }
}
