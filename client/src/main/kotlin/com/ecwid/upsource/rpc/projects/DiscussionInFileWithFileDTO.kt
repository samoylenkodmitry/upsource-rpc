// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

data class DiscussionInFileWithFileDTO(
	/**
	 * VCS revision ID (optional)
	 */
	val revisionId: String? = null,

	/**
	 * A full path of the file starting with a slash (e.g. /folder/subfolder/file.txt ) (required)
	 */
	val fileName: String,

	/**
	 * See DiscussionInFileDTO parameters (required)
	 */
	val discussionInFile: DiscussionInFileDTO
) {
	internal constructor() : this(
		revisionId = null,
		fileName = "",
		discussionInFile = DiscussionInFileDTO()
	)
}
