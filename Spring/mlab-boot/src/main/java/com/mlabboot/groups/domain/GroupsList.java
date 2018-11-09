package com.mlabboot.groups.domain;

import com.mlabboot.groups.domain.Groups;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupsList {

	private List<Groups> groups;
}
