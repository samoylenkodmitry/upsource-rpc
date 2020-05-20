package com.ecwid.upsource.rpc.projects

data class FileFragmentAuthorsRequestDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 */
	val file: com.ecwid.upsource.rpc.ids.FileInRevisionDTO,

	/**
	 * Line number the fragment starts with (required)
	 */
	val startLine: Int,

	/**
	 * Line number the fragment ends with (required)
	 */
	val endLine: Int
) {
	internal constructor() : this(
		file = com.ecwid.upsource.rpc.ids.FileInRevisionDTO(),
		startLine = 0,
		endLine = 0
	)
}
