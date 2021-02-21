// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param id Repository ID
 * @param url Repository URL
 */
@Suppress("unused")
data class VcsRepoDTO(
	/**
	 * Repository ID (required)
	 */
	val id: String,

	/**
	 * Repository URL (repeated)
	 */
	val url: List<String> = emptyList()
) {
	@Suppress("unused")
	internal constructor() : this(
		id = "",
		url = emptyList()
	)
}
