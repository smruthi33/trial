/**
 * 
 */
/**
 * @author smruthirajmohan
 *
 */
module Test {
	exports com.cloudbees.syslog;
	exports com.cloudbees.syslog.sender;
	exports com.cloudbees.syslog.integration.jul;
	exports com.cloudbees.syslog.integration.jul.util;
	exports com.cloudbees.syslog.util;

	requires java.logging;
	requires java.sql;
	requires syslog.java.client;
}