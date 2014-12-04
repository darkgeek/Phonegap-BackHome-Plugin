Phonegap-BackHome-Plugin
========================

## What's this?

It's a cordova/phonegap plugin to send your app to background by starting Home activity. Tested on `cordova` 4.1.2 .

## Installation

    cordova plugin add https://github.com/darkgeek/Phonegap-BackHome-Plugin.git

## Usage

This plugin provides one method called `goHome(successCallback, errorCallback)` to start Home activity.

    window.BackHome.goHome(successCallback, errorCallback);

## History

Originally developed by [Dpa99c](http://stackoverflow.com/users/777265/dpa99c) in [stackoverflow](http://stackoverflow.com/questions/17826122/send-application-to-background-mode-when-back-button-is-pressed-in-phonegap/17828434#17828434), and updated by me to make it work with `cordova` 4.0 and later.
