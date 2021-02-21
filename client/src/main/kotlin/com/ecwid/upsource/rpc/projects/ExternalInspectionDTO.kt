// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param revisionId VCS revision ID
 * @param fileName Name of the file
 * @param line Line number
 * @param severity Inspection severity
 * @param message Inspection message
 */
@Suppress("unused")
data class ExternalInspectionDTO(
	/**
	 * VCS revision ID (required)
	 */
	val revisionId: String,

	/**
	 * Name of the file (required)
	 */
	val fileName: String,

	/**
	 * Line number (required)
	 */
	val line: Int,

	/**
	 * Inspection severity (required)
	 */
	val severity: com.ecwid.upsource.rpc.fileordirectorycontent.InspectionSeverityEnum,

	/**
	 * Inspection message (required)
	 */
	val message: String
) {
	@Suppress("unused")
	internal constructor() : this(
		revisionId = "",
		fileName = "",
		line = 0,
		severity = com.ecwid.upsource.rpc.fileordirectorycontent.InspectionSeverityEnum.INFORMATION,
		message = ""
	)
}
