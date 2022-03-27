---
layout: page
title: Algorithms
permalink: /algorithms/
---

<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/pdf.js/2.13.216/pdf.min.js"></script>

SODM+T includes several algorithms for computing local performance requirements from a global requirement and an optional set of local annotations.
This page will give a brief illustration of how they work: for more details, please consult the [publications](/about) or the Github repository (see link above).

# Throughput inference

This computes how many requests each node will need to handle, if the whole process/composition needs to handle a certain number of requests per second.

<div data-pdf="01-throughput.pdf" class="pdf-slides"></div>

# Time limit inference (exhaustive)

This computes the time limit for each executable node in the model, by distributing fairly (according to relative weights) the available *slack* after considering the minimum times requested by each node.

The algorithm is relatively straightforward, but it can struggle once we have many possible paths (e.g. in the case we have multiple branching paths that merge later).

<div data-pdf="02-tlimits-exhaustive.pdf" class="pdf-slides"></div>

# Time limit inference (incremental)

This is a more efficient form of the previous approach, by taking into account the fact that many subpaths can be discarded early as they will never be as strict as others.

<div data-pdf="03-tlimits-incremental.pdf" class="pdf-slides"></div>

<script src="pdf-slides.js"></script>
