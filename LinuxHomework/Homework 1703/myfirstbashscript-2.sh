#!/bin/bash
USER= "aleksandra"
echo "Today's date is $(date)"
echo "Hello $USER!"
echo "I'm currently working in the directory $(pwd)"
echo "There are currently $(ps aux | wc -l) process running"

