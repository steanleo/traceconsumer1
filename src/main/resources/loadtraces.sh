while IFS= read -r line; do
curl -H "Content-Type: application/json" -X POST --data-binary "$line" http://localhost:8083/traces;
done < traces.json