// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param startLine Line number to start with
 * @param lineCount How many lines
 * @param revision See RevisionInfoDTO parameters
 * @param filePath A full path to the file starting with a slash (e.g. /directory/file.txt)
 * @param priorChangeAnnotation A reference to the prior revision of this section (only revision and file, but not the line number / line count)
 */
@Suppress("unused")
data class FileAnnotationSectionDTO(
	/**
	 * Line number to start with (required)
	 */
	val startLine: Int,

	/**
	 * How many lines (required)
	 */
	val lineCount: Int,

	/**
	 * See RevisionInfoDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.RevisionInfoDTO
	 */
	val revision: RevisionInfoDTO,

	/**
	 * A full path to the file starting with a slash (e.g. /directory/file.txt) (required)
	 */
	val filePath: String,

	/**
	 * A reference to the prior revision of this section (only revision and file, but not the line number / line count) (optional)
	 */
	val priorChangeAnnotation: FileAnnotationSectionDTO? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		startLine = 0,
		lineCount = 0,
		revision = RevisionInfoDTO(),
		filePath = "",
		priorChangeAnnotation = null
	)
}
