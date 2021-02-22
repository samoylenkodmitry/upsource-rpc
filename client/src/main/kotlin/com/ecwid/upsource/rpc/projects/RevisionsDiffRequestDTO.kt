// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param baseRevision ID of the base revision
 * @param secondRevision ID of the revision that should be compared to the base revision
 */
@Suppress("unused")
data class RevisionsDiffRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * ID of the base revision (required)
	 */
	val baseRevision: String,

	/**
	 * ID of the revision that should be compared to the base revision (required)
	 */
	val secondRevision: String
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		baseRevision = "",
		secondRevision = ""
	)
}

