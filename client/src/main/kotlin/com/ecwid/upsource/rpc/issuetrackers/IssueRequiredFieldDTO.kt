// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.issuetrackers

/**
 * @param issueTypeId Issue type ID
 * @param field See IssueFieldDTO parameters
 * @param fieldType Field type
 */
@Suppress("unused")
data class IssueRequiredFieldDTO(
	/**
	 * Issue type ID (required)
	 */
	val issueTypeId: String,

	/**
	 * See IssueFieldDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.issuetrackers.IssueFieldDTO
	 */
	val field: IssueFieldDTO,

	/**
	 * Field type (required)
	 */
	val fieldType: IssueRequiredFieldTypeEnum
) {
	@Suppress("unused")
	internal constructor() : this(
		issueTypeId = "",
		field = IssueFieldDTO(),
		fieldType = IssueRequiredFieldTypeEnum.TEXT
	)
}
