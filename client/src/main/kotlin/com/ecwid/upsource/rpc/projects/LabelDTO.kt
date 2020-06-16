// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

data class LabelDTO(
	/**
	 * Discussion label ID (optional)
	 */
	val id: String? = null,

	/**
	 * Discussion label name (e.g. bug, code style, enhancement, help wanted) (required)
	 */
	val name: String,

	/**
	 * Discussion label color (optional)
	 */
	val colorId: String? = null
) {
	internal constructor() : this(
		id = null,
		name = "",
		colorId = null
	)
}
