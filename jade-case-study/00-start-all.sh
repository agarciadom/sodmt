#!/bin/bash

mvn install

tmux new-session -d './01-start-main-container.sh'
sleep 5s
tmux split-window './02-start-wsig.sh'
sleep 5s
tmux split-window './03-start-agents.sh'

tmux select-layout even-vertical
tmux attach
