// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param counter A discussion counter for a revision (number of discussions)
 */
@Suppress("unused")
data class RevisionDiscussionCountersListDTO(
	/**
	 * A discussion counter for a revision (number of discussions) (repeated)
	 */
	val counter: List<SimpleDiscussionCounterDTO> = emptyList()
)