#!/bin/bash
fileList=`ls ./`
for fileName in $fileList
do
    firstName=${fileName%%.*}
    lastName=${fileName#*.}
    if [[ "$lastName" == "yml" || "$lastName" == "yaml" ]]
    then
        curl --request PUT --data-binary @$fileName http://192.168.99.100:8500/v1/kv/dubbo/$firstName/data
    else
        echo "$fileName not yml"
    fi
done
