/*
 * PhoneGap is available under *either* the terms of the modified BSD license *or* the
 * MIT License (2008). See http://opensource.org/licenses/alphabetical for full text.
 *
 * Copyright (c) 2005-2010, Nitobi Software Inc.
 * Copyright (c) 2010-2011, IBM Corporation
 */

if (!PhoneGap.hasResource("work")) {
PhoneGap.addResource("work");

/**
 * This class contains information about the current network Connection.
 * @constructor
 */
var HH = function() {
	
};

HH.prototype.textLogin = function(successCallback, errorCallback) {
    PhoneGap.exec(successCallback, errorCallback, "Text_Plugin", "textLogin");
};

PhoneGap.addConstructor(function() {
    if (typeof navigator.comment === "undefined") {
    	navigator.comment = new HH();
    }
});
}
