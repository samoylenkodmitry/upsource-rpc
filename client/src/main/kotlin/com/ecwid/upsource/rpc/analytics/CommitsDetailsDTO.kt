// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param commits See CommitInfo parameters
 */
@Suppress("unused")
data class CommitsDetailsDTO(
	/**
	 * See CommitInfo parameters (repeated)
	 *
	 * @see com.ecwid.upsource.rpc.analytics.CommitInfo
	 */
	val commits: List<CommitInfo> = emptyList()
)
