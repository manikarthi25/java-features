package com.manikarthi25.java9;

public class VersionStringScheme {

	public static void main(String[] args) {
		Runtime.Version version = Runtime.version(); // Getting runtime version instance
		System.out.println("Current version is " + version); // Getting current Java version
		System.out.println("Major version number " + version.major()); // Getting major version number
		System.out.println("Minor version number " + version.minor()); // Getting minor version number
		System.out.println("Security version number " + version.security()); // Getting security version number
		System.out.println("Pre-released information " + version.pre()); // Getting pre-release version information
		System.out.println("Build Number " + version.build()); // Getting Optional build number
	}

}

/*
output
-------
Current version is 17.0.7+7
Major version number 17
Minor version number 0
Security version number 7
Pre-released information Optional.empty
Build Number Optional[7]
*/

/*
Java version-string is a format that contains version specific information. 
This version-string consists of major, minor, security and patch update releases.

$MAJOR
This version number shows a major change in Java version. 
It increases when a major change occurs. Like Java 8 to Java 9. Each major release contains new features to the existing one.

$MINOR
This version number shows minor changes in Java version and increases with each minor update. 
These updates can be bug fixes, revision to standard API etc. 
if an update is released to Java 9, version-string format will be Java 9.1 (contains major and minor release number).

$SECURITY
This version number represents security update and increase for each new security update.
Security updates can be critical fixes and security issues. 
If any security update is released to Java 9, the version-string format will be like: Java 9.1.5 (contains major, minor and security release number).

$PATCH
This version number increases for each security and high-priority customer fixes, which has been tested together. 
If a patch is released to Java 9, version-string format will be Java 9.1.5.1 (contains major, minor, security and patch release number).
*/

