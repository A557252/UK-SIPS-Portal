/**
 * User package module.
 * Manages all sub-modules so other RequireJS modules only have to import the package.
 */
define(['angular', './routes', './services'], function(angular) {
  'use strict';

  return angular.module('yourprefix.user', ['ngCookies', 'ngRoute', 'user.routes', 'user.services','ngOpbeat'])
  .config(function ($opbeatProvider) {
        $opbeatProvider.config({
            orgId: '28ce255deee04b7ca965e50a11dcf87b',
            appId: 'b6b16e205d'
        })
});

           