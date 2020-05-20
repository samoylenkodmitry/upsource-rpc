package com.ecwid.upsource.rpc.projects

data class FileDiffRequestDTO(
	/**
	 * See FileInRevisionDTO parameters (optional)
	 */
	val leftFile: com.ecwid.upsource.rpc.ids.FileInRevisionDTO? = null,

	/**
	 * See FileInRevisionDTO parameters (optional)
	 */
	val rightFile: com.ecwid.upsource.rpc.ids.FileInRevisionDTO? = null,

	/**
	 * Whether to ignore whitespace changes (required)
	 */
	val ignoreWhitespace: Boolean,

	/**
	 * Whether the left file for comparison is 'no-file' (for internal use only) (optional)
	 */
	val isLeftFileDefinedAsNull: Boolean? = null,

	/**
	 * Number of context lines around the modified fragment (optional)
	 */
	val contextLines: Int? = null
) {
	internal constructor() : this(
		leftFile = null,
		rightFile = null,
		ignoreWhitespace = false,
		isLeftFileDefinedAsNull = null,
		contextLines = null
	)
}
