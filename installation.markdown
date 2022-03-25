---
layout: page
title: Installation
permalink: /installation/
---

To install SODM+T as a user, please make sure that you can clone Github repositories via SSH (see [here](https://docs.github.com/es/authentication/connecting-to-github-with-ssh)), and follow the steps below.
If you would like to work on the source code, follow the [contributor instructions](https://github.com/agarciadom/sodmt/blob/master/CONTRIBUTING.md) in the Github repository.

# Run Eclipse Installer

First, download and run the [Eclipse Installer](https://www.eclipse.org/downloads/).
You will be greeted by a window like this one:

![Basic installer](installer-basic.png)

Click on the three-line button on the top right, and select "Advanced Mode".
You will switch to a window like this one:

![Advanced mode](installer-advance.png)

Select the "Eclipse Modeling Tools", and use version 2021-12 (later versions do not currently work, due to a conflict between versions of the Batik library).
You should also use a Java 11 or newer JDK.

Click on Next, and you will then move on to the Projects page.

# Add the SODM+T Models project setup

You should see a window like this one:

![Projects page](installer-projects.png)

If this is the first time you install SODM+T, you will not see those SODM+T entries in the list. Follow these steps:

1. Click on the "+" button.
1. Select the "Github Projects" option within "Catalog".
1. Paste the URL of [this link](https://raw.githubusercontent.com/agarciadom/sodmt/master/workspace-models/sodmt.models.oomph/SODMTModelsGIT.setup) into the "Resource URIs" field.
1. Click on OK.

You should now be able to see the "SODM+T Models GIT" option.
Tick it, and click on Next.

# Confirm actions

The installer will then ask for confirmation of the resolved actions:

![Confirmation page](installer-confirmation.png)

Click on Next.

# Monitor progress

The installer will now display the installation progress: if this is your first time installing SODM+T, it may take a while.

![Progress page](installer-progress.png)

To reduce the need for manual interaction, it's best to tick both the "Dismiss automatically" and "Launch automatically" options.
Otherwise, you will need to manually click "Finish" when it's done.

# First start

The modeling environment should be starting automatically now.
After some time, you will see the usual Eclipse welcome screen: dismiss it, and in short order the Eclipse Updater window will pop up:

![Updater page](updater-progress.png)

Eclipse will now automatically clone this repository via SSH (if it fails, see [these instructions](https://docs.github.com/es/authentication/connecting-to-github-with-ssh) and restart Eclipse), and import the sample model projects in `workspace-models`.

You should see the projects listed below:

![First start](install-completed.png)

# Registering the WS and WSDL profiles for Papyrus

Before opening any other models, make sure Papyrus is aware of the SODM+T-specific WS and WSDL profiles by opening these models:

* `ws.profile/model.profile.di`
* `wsdl.profile/model.profile.di`