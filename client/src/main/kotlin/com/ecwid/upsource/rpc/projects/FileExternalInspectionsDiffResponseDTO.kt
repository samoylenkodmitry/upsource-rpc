// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param fileId Name of the file containing differing inspections
 * @param introduced Count of introduced problems
 * @param fixed Count of fixed problems
 */
@Suppress("unused")
data class FileExternalInspectionsDiffResponseDTO(
	/**
	 * Name of the file containing differing inspections (required)
	 */
	val fileId: String,

	/**
	 * Count of introduced problems (optional)
	 */
	val introduced: InspectionsCountDTO? = null,

	/**
	 * Count of fixed problems (optional)
	 */
	val fixed: InspectionsCountDTO? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		fileId = "",
		introduced = null,
		fixed = null
	)
}
