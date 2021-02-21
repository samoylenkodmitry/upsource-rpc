// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param revisionId IDs of the requested revisions
 */
@Suppress("unused")
data class RevisionListDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * IDs of the requested revisions (repeated)
	 */
	val revisionId: List<String> = emptyList()
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		revisionId = emptyList()
	)
}
