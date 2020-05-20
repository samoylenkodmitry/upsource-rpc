package com.ecwid.upsource.rpc.fileordirectorycontent

data class FilePsiRequestDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 */
	val file: com.ecwid.upsource.rpc.ids.FileInRevisionDTO,

	/**
	 * Whether to request references (optional)
	 */
	val requestReferences: Boolean? = null,

	/**
	 * Whether to request gutter marks (optional)
	 */
	val requestGutterMarks: Boolean? = null,

	/**
	 * Whether to request inspections (optional)
	 */
	val requestInspections: Boolean? = null
) {
	internal constructor() : this(
		file = com.ecwid.upsource.rpc.ids.FileInRevisionDTO(),
		requestReferences = null,
		requestGutterMarks = null,
		requestInspections = null
	)
}
