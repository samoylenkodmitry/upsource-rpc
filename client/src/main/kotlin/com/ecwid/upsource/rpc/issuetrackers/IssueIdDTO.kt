// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.issuetrackers

/**
 * @param issueId Issue ID
 * @param issueLink Issue link
 * @param isCreatedFromUpsource Whether the issue has been created from Upsource
 */
@Suppress("unused")
data class IssueIdDTO(
	/**
	 * Issue ID (required)
	 */
	val issueId: String,

	/**
	 * Issue link (optional)
	 */
	val issueLink: String? = null,

	/**
	 * Whether the issue has been created from Upsource (optional)
	 */
	val isCreatedFromUpsource: Boolean? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		issueId = "",
		issueLink = null,
		isCreatedFromUpsource = null
	)
}
