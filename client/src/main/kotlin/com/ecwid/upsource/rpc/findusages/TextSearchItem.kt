// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param file The file in a particular project and revision
 * @param revisionInfo See RevisionInfoDTO parameters
 * @param contentType File content type
 * @param isDeleted Whether this file is deleted
 * @param projectDetails Project details
 * @param snippets Code snippets
 * @param totalMatches Total number of matches in the file
 */
@Suppress("unused")
data class TextSearchItem(
	/**
	 * The file in a particular project and revision (required)
	 */
	val file: com.ecwid.upsource.rpc.ids.FileInRevisionDTO,

	/**
	 * See RevisionInfoDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.RevisionInfoDTO
	 */
	val revisionInfo: com.ecwid.upsource.rpc.projects.RevisionInfoDTO,

	/**
	 * File content type (required)
	 */
	val contentType: com.ecwid.upsource.rpc.fileordirectorycontent.FileContentTypeDTO,

	/**
	 * Whether this file is deleted (required)
	 */
	val isDeleted: Boolean,

	/**
	 * Project details (required)
	 */
	val projectDetails: TextSearchProjectDetails,

	/**
	 * Code snippets (repeated)
	 */
	val snippets: List<TextSearchSnippet> = emptyList(),

	/**
	 * Total number of matches in the file (required)
	 */
	val totalMatches: Int
) {
	@Suppress("unused")
	internal constructor() : this(
		file = com.ecwid.upsource.rpc.ids.FileInRevisionDTO(),
		revisionInfo = com.ecwid.upsource.rpc.projects.RevisionInfoDTO(),
		contentType = com.ecwid.upsource.rpc.fileordirectorycontent.FileContentTypeDTO(),
		isDeleted = false,
		projectDetails = TextSearchProjectDetails(),
		snippets = emptyList(),
		totalMatches = 0
	)
}
