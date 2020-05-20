package com.ecwid.upsource.rpc.issuetrackers

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
	internal constructor() : this(
		issueId = "",
		issueLink = null,
		isCreatedFromUpsource = null
	)
}
