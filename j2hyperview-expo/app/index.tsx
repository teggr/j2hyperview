import { Text, View } from "react-native";
import "hyperview";
import {NavigationContainer} from "@react-navigation/native";
import Hyperview from "hyperview";
import moment from 'moment';

 const formatDate = (
    date: Date | null | undefined,
    format: string | undefined,
) => moment(date).format(format);

 const fetchWrapper = (
    input: RequestInfo | URL,
    init: RequestInit | undefined = { headers: {} },
): Promise<Response> => {
    return fetch(input, {
        ...init,
        headers: {
            // Don't cache requests for the demo
            'Cache-Control': 'no-cache, no-store, must-revalidate',
            Expires: '0',
            Pragma: 'no-cache',
            ...init.headers,
        },
        //mode: 'cors',
    });
};

export default function Index() {
  return (
    <View
      style={{
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
      }}
    >
            <Hyperview formatDate={formatDate} entrypointUrl="http://localhost:8080/" fetch={fetchWrapper}  />
    </View>
  );
}
