package org.sdrc.domain;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * 
 * @author Azaruddin(azaruddin@sdrc.co.in)
 *
 */

public class UserModel extends User {

	private static final long serialVersionUID = 3070385867750194519L;

	// add all extra required details for your application
	private long userLoginMetaId;

	Collection<UserAreaMapping> areaMappings;
	// Using private constructor to force initialization of extra parameters
	private UserModel(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}

	public UserModel(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities, Integer userLoginMetaId,Collection<UserAreaMapping> areaMappings) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		this.areaMappings = areaMappings;
		this.userLoginMetaId = userLoginMetaId;
	}

	public long getUserLoginMetaId() {
		return userLoginMetaId;
	}

	public void setUserLoginMetaId(long userLoginMetaId) {
		this.userLoginMetaId = userLoginMetaId;
	}

	

}
