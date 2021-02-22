// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param projectId Project ID in Upsource
 * @param module Name of the project module
 * @param referenceTime Unix timestamp used to calculate the distribution. This timestamp encapsulates the time set on the client and makes the server generate even days, months, etc. for the particular client.
 */
@Suppress("unused")
data class ProjectActivityRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Name of the project module (optional)
	 */
	val module: String? = null,

	/**
	 * Unix timestamp used to calculate the distribution. This timestamp encapsulates the time set on the client and makes the server generate even days, months, etc. for the particular client. (required)
	 */
	val referenceTime: Long
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		module = null,
		referenceTime = 0L
	)
}

