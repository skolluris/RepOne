/**
 * 
 */
package com.kolluri.learning.sample;

import org.apache.log4j.Logger;

/**
 * @author pradeep.sampath
 *
 */
public class FirstFile {

	private static Logger log = Logger.getLogger( FirstFile.class );
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		log.info( "Welcome to my first java class in GIT" );
		log.warn( "You are about to view my personal file, so be ready for giving your credentials" );
		
		String username = "Kolluri";
		String password = "iamcrazy";
		String authorizationKey = "hdushui6sd78tdashgdsuyt786";
		
		log.debug( "username = " + username + "; password = " + password + "; authorizationKey = " + authorizationKey );
		
		log.info( "Thanksa lot for visiting my first java program tour. See you on the other side" );
	}

}
