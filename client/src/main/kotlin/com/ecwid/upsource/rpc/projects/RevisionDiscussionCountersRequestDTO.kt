// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param revisions See RevisionListDTO parameters
 * @param fileNameFilter Additional revisions filter
 */
@Suppress("unused")
data class RevisionDiscussionCountersRequestDTO(
	/**
	 * See RevisionListDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.RevisionListDTO
	 */
	val revisions: RevisionListDTO,

	/**
	 * Additional revisions filter (optional)
	 */
	val fileNameFilter: String? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		revisions = RevisionListDTO(),
		fileNameFilter = null
	)
}
